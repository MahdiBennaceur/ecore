package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Configuration;
import org.occiware.clouddesigner.occi.Kind;
import org.occiware.clouddesigner.occi.Link;
import org.occiware.clouddesigner.occi.Mixin;
import org.occiware.clouddesigner.occi.Resource;

/**
 * 
 * @author Mehdi Ahmed-Nacer
 *
 */


public class Parser {

	Configuration configuration;

	public Parser(Configuration config){
		this.configuration= config;
	}

	public Map<Entity, Set<Entity>> parsing(){
		System.out.println("start parsing ...");
		Map<Entity, Set<Entity>> entities = new HashMap<Entity, Set<Entity>>();

		for(Resource resource : configuration.getResources()) {
			Kind resourceKind = resource.getKind();
			if(resourceKind.getScheme().contains("simulation")){
				if(resourceKind.getTerm().contains("datacenter")){ //datacenterKind
					Dc_Config dc = DcFromResource(resource);
					entities.put(dc,new HashSet<Entity>());
					System.out.println(dc);
				}else if(resourceKind.getTerm().contains("host")){//hostKind
					Host_Config host = HostFromResource(resource);
					entities.put(host, new HashSet<Entity>());
					System.out.println(host);
				}else if(resourceKind.getTerm().contains("VM")){//VMKind
					VM_Config vm = VMFromResource(resource);
					entities.put(vm, new HashSet<Entity>());
					System.out.println(vm);
				}else if(resourceKind.getTerm().contains("cloudlet")){ //cloudletKind
					Cloudlet_Config cloudlet = CloudletFromResource(resource);
					entities.put(cloudlet, new HashSet<Entity>());
					System.out.println(cloudlet);
				}else{ 

				}
			}else{//Otherwise, the resources are tagued
				for(Mixin mixin : resource.getMixins()) {
					if(mixin.getScheme().contains("simulation")){
						if(mixin.getTerm().contains("datacenter")){
							Dc_Config dc = DcFromResource(resource);
							entities.put(dc, new HashSet<Entity>());
							System.out.println(dc);
						}else if(mixin.getTerm().contains("host")){
							Host_Config host = HostFromResource(resource);
							entities.put(host, new HashSet<Entity>());
							System.out.println(host);
						}else if (mixin.getTerm().contains("VM")){
							VM_Config vm = VMFromResource(resource);
							entities.put(vm, new HashSet<Entity>());
							System.out.println(vm);
						}else if (mixin.getTerm().contains("cloudlet")){
							Cloudlet_Config cloudlet = CloudletFromResource(resource);
							entities.put(cloudlet, new HashSet<Entity>());
							System.out.println(cloudlet);
						}
					}
				}

			}
		}
		
		//Link entities
		for(Entity ent: entities.keySet()){
			for(Entity link: entities.keySet()){
				if(ent.getLinkedResourceId().contains(link.getId())){
					if(isDC(ent) && isHost(link))
						entities.get(ent).add(link);
					else if (isHost(ent) && isVM(link))
						entities.get(ent).add(link);
					else if (isVM(ent) && isCloudlet(link))
						entities.get(ent).add(link);
				}
			}
			
		}
		return entities;
	}

	/*********************************************************************************/
	/****************  Fill the attributes of each entity **************************/
	/*********************************************************************************/
	/*********************************************************************************/

	private Cloudlet_Config CloudletFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int cloudletId=0,pesNumber=0;
		long cloudletLength=0, cloudletFileSize=0, cloudletOutputSize=0;
		String utilizationModelCpu="", utilizationModelRam="", utilizationModelBw="";

		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("cloudletId")) cloudletId = Integer.parseInt(as.getValue());
			else if (as.getName().contains("core")) pesNumber = Integer.parseInt(as.getValue());
			else if (as.getName().equals("cloudletLength")) cloudletLength = Long.parseLong(as.getValue());
			else if (as.getName().equals("cloudletFileSize")) cloudletFileSize = Long.parseLong(as.getValue());
			else if (as.getName().equals("cloudletOutputSize")) cloudletOutputSize = Long.parseLong(as.getValue());
			else if (as.getName().equals("utilizationModelCpu")) utilizationModelCpu = as.getValue();
			else if (as.getName().equals("utilizationModelRam")) utilizationModelRam = as.getValue();
			else if (as.getName().equals("utilizationModelBw")) utilizationModelBw = as.getValue();
		}

		return new Cloudlet_Config(id, idTarget, cloudletId, pesNumber, cloudletLength, cloudletFileSize,
				cloudletOutputSize, utilizationModelCpu, utilizationModelRam,
				utilizationModelBw);
	}

	private VM_Config VMFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int id_vm=0, numberOfPes=0, ram=0;
		double mips=0;
		long bw=0, size=0;
		String vmm="";
		String cloudletScheduler="";

		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("id_vm")) id_vm = Integer.parseInt(as.getValue());
			else if (as.getName().contains("speed")) mips = Double.parseDouble(as.getValue());//mips ?
			else if (as.getName().contains("core")) numberOfPes = Integer.parseInt(as.getValue());//numberOfPes ?
			else if (as.getName().contains("memory")) ram = Integer.parseInt(as.getValue());//ram ?
			else if (as.getName().equals("bw")) bw = Long.parseLong(as.getValue());
			else if (as.getName().equals("storage")) size = Long.parseLong(as.getValue());
			else if (as.getName().equals("vmm")) vmm = as.getValue();
			else if (as.getName().equals("cloudletScheduler")) cloudletScheduler = as.getValue();
		}
		//resource linked to VM
		for(Link link : resource.getLinks()) {
			if(link.getTarget().getKind().getTerm().contains("cloudlet")){
				idTarget.add(link.getTarget().getId());
			}else{
				for(Mixin m: link.getTarget().getMixins()){
					if(m.getTerm().contains("cloudlet")){
						idTarget.add(link.getTarget().getId());
					}
				}
			}
		}

		return new VM_Config(id, idTarget, id_vm, numberOfPes, ram, mips,
				bw, size, vmm, cloudletScheduler) ;
	}	

	private Host_Config HostFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int id_host=0, core=0, ram=0, bw=0;
		String ramProvisioner="", bwProvisioner="", peProvisioner="",vmScheduler="";
		long storage=0;
		double mips=0;

		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("id_host")) id_host = Integer.parseInt(as.getValue());
			else if (as.getName().contains("speed")) mips = Double.parseDouble(as.getValue());//mips ?
			else if (as.getName().contains("cores")) core = Integer.parseInt(as.getValue());
			else if (as.getName().equals("ram")) ram = Integer.parseInt(as.getValue());
			else if (as.getName().equals("bw")) bw = Integer.parseInt(as.getValue());
			else if (as.getName().equals("storage")) storage = Long.parseLong(as.getValue());
			else if (as.getName().equals("ramProvisioner")) ramProvisioner = as.getValue();
			else if (as.getName().equals("bwProvisioner")) bwProvisioner = as.getValue();
			else if (as.getName().equals("vmScheduler")) vmScheduler = as.getValue();
			else if (as.getName().equals("peProvisioner")) peProvisioner = as.getValue();
		}
		//VM linked to host
		for(Link link : resource.getLinks()) {
			if(link.getTarget().getKind().getTerm().contains("VM")){
				idTarget.add(link.getTarget().getId());
			}else{
				for(Mixin m: link.getTarget().getMixins()){
					if(m.getTerm().contains("VM")){
						idTarget.add(link.getTarget().getId());
					}
				}
			}
		}

		return new Host_Config(id, idTarget, id_host, mips, core, ramProvisioner,
				bwProvisioner, vmScheduler, peProvisioner, storage, ram, bw);

	}


	private Dc_Config DcFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();

		String architecture = "", os="", vmm="", name="";
		double schedulingInterval= 0, timeZone=0, costPerSec=0, costPerMem=0, costPerStorage=0, costPerBw=0;
		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().contains("arch")) architecture = as.getValue();
			else if(as.getName().equals("os")) os = as.getValue();
			else if(as.getName().equals("vmm")) vmm = as.getValue();
			else if(as.getName().equals("time_zone")) timeZone = Double.parseDouble(as.getValue());
			else if(as.getName().equals("cost")) costPerSec = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerMem")) costPerMem = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerStorage")) costPerStorage = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerBw")) costPerBw = Double.parseDouble(as.getValue());
			else if(as.getName().equals("name")) name = as.getValue();
			else if(as.getName().equals("schedulingInterval")) schedulingInterval = Double.parseDouble(as.getValue());
		}

		//host linked to datacenter
		for(Link link : resource.getLinks()) {
			if(link.getTarget().getKind().getTerm().contains("host")){
				idTarget.add(link.getTarget().getId());
			}else{
				for(Mixin m: link.getTarget().getMixins()){
					if(m.getTerm().contains("host")){
						idTarget.add(link.getTarget().getId());
					}
				}	
			}
		}

		//create datacenter
		return new Dc_Config(id, idTarget, name, architecture, os, vmm, timeZone, costPerSec, costPerMem, 
				costPerStorage, costPerBw, schedulingInterval);

	}

	/*********************************************************************************/
	/******************************  PRIVATE CLASSES *********************************/
	/*********************************************************************************/
	/*********************************************************************************/
	protected class Cloudlet_Config implements Entity{
		String id; //ressourceId
		List<String> idTarget;
		int cloudletId,pesNumber;
		long cloudletLength, cloudletFileSize, cloudletOutputSize;
		String utilizationModelCpu, utilizationModelRam,utilizationModelBw;

		public Cloudlet_Config(String id, List<String> idTarget, int cloudletId, int pesNumber, long cloudletLength, long cloudletFileSize,
				long cloudletOutputSize, String utilizationModelCpu, String utilizationModelRam,
				String utilizationModelBw) {
			this.id = id;
			this.idTarget = idTarget;
			this.cloudletId = cloudletId;
			this.pesNumber = pesNumber;
			this.cloudletLength = cloudletLength;
			this.cloudletFileSize = cloudletFileSize;
			this.cloudletOutputSize = cloudletOutputSize;
			this.utilizationModelCpu = utilizationModelCpu;
			this.utilizationModelRam = utilizationModelRam;
			this.utilizationModelBw = utilizationModelBw;
		}
		@Override
		public String toString() {
			return "Cloudlet [cloudletId=" + cloudletId + ", pesNumber=" + pesNumber + ", cloudletLength="
					+ cloudletLength + ", cloudletFileSize=" + cloudletFileSize + ", cloudletOutputSize="
					+ cloudletOutputSize + ", utilizationModelCpu=" + utilizationModelCpu + ", utilizationModelRam="
					+ utilizationModelRam + ", utilizationModelBw=" + utilizationModelBw + "]";
		}
		@Override
		public String getId() {
			return id;
		}
		@Override
		public List<String> getLinkedResourceId() {
			return idTarget;
		}
	}

	protected class VM_Config implements Entity{
		String id; //ressourceId
		List<String> idTarget;
		int id_vm, numberOfPes, ram;
		double mips;
		long bw, size;
		String vmm;
		String cloudletScheduler;

		public VM_Config(String id, List<String> idTarget, int id_vm, int numberOfPes, int ram, double mips,
				long bw, long size, String vmm, String cloudletScheduler) {
			this.id = id;
			this.idTarget = idTarget;
			this.id_vm = id_vm;
			this.numberOfPes = numberOfPes;
			this.ram = ram;
			this.mips = mips;
			this.bw = bw;
			this.size = size;
			this.vmm = vmm;
			this.cloudletScheduler = cloudletScheduler;
		}

		@Override
		public String toString() {
			return "VM [id=" + id + ", idTarget=" + idTarget + ", id_vm=" + id_vm + 
					", numberOfPes=" + numberOfPes + ", ram=" + ram + ", mips=" + mips + ", bw=" + bw + ", size="
					+ size + ", vmm=" + vmm + ", cloudletScheduler=" + cloudletScheduler + "]";
		}

		@Override
		public String getId() {
			return id;
		}
		@Override
		public List<String> getLinkedResourceId() {
			return idTarget;
		}
	}


	protected class Host_Config implements Entity{
		String id; //ressourceId
		List<String> idTarget;
		int id_host, core, ram, bw;
		double mips;
		String ramProvisioner, bwProvisioner,peProvisioner, vmScheduler;
		long storage;
		public Host_Config(String id, List<String> idTarget, int id_host, double mips, int core, String ramProvisioner,
				String bwProvisioner, String vmScheduler, String peProvisioner, long storage, int ram, int bw) {
			this.id = id;
			this.idTarget = idTarget;
			this.id_host = id_host;
			this.mips = mips;
			this.core = core;
			this.ramProvisioner = ramProvisioner;
			this.bwProvisioner = bwProvisioner;
			this.peProvisioner = peProvisioner;
			this.vmScheduler = vmScheduler;
			this.storage = storage;
			this.bw = bw;
			this.ram = ram;
		}
		
		@Override
		public String toString() {
			return "Host_Config [id=" + id + ", idTarget=" + idTarget + ", id_host=" + id_host + ", mips=" + mips
					+ ", core=" + core + ", ram=" + ram + ", bw=" + bw + ", ramProvisioner=" + ramProvisioner
					+ ", bwProvisioner=" + bwProvisioner + ", peProvisioner=" + peProvisioner + ", vmScheduler="
					+ vmScheduler + ", storage=" + storage + "]";
		}

		@Override
		public String getId() {
			return id;
		}
		@Override
		public List<String> getLinkedResourceId() {
			return idTarget;
		}
	}

	protected class Dc_Config implements Entity{
		String id;
		List<String> targetId; //list of hosts
		String vmm, os, name, architecture;
		double schedulingInterval;
		double time_zone, costPerSec, costPerMem, costPerStorage, costPerBw;

		public Dc_Config(String id, List<String> targetId, String name,
				String architecture, String os, String vmm, double time_zone, 
				double costPerSec, double costPerMem, double costPerStorage, double costPerBw, double schedulingInterval){
			this.architecture = architecture;
			this.id = id;
			this.targetId = targetId;
			this.vmm = vmm;
			this.os = os;
			this.name = name;
			this.schedulingInterval = schedulingInterval;
			this.costPerSec = costPerSec;
			this.costPerMem = costPerMem;
			this.costPerStorage = costPerStorage;
			this.costPerBw = costPerBw;
			this.time_zone = time_zone;	
		}
		
		@Override
		public String toString() {
			return "Dc_Config [id=" + id + ", targetId=" + targetId + ", vmm=" + vmm + ", os=" + os + ", name=" + name
					+ ", architecture=" + architecture + ", schedulingInterval=" + schedulingInterval + ", time_zone="
					+ time_zone + ", costPerSec=" + costPerSec + ", costPerMem=" + costPerMem + ", costPerStorage="
					+ costPerStorage + ", costPerBw=" + costPerBw + "]";
		}

		@Override
		public String getId() {
			return id;
		}

		@Override
		public List<String> getLinkedResourceId() {
			return targetId;
		}
	}
	
	protected interface Entity{
		public String getId();
		public List<String> getLinkedResourceId();
		public String toString();
	}
	
	/*************** PRIVATE METHOD *****************/
	public boolean isDC(Object obj){
		if(obj instanceof Dc_Config){
			return true;
		}
		return false;
	}

	public boolean isHost(Object obj){
		if(obj instanceof Host_Config){
			return true;
		}
		return false;
	}

	public boolean isVM(Object obj){
		if(obj instanceof VM_Config){
			return true;
		}
		return false;
	}

	public boolean isCloudlet(Object obj){
		if(obj instanceof Cloudlet_Config){
			return true;
		}
		return false;
	}

}
