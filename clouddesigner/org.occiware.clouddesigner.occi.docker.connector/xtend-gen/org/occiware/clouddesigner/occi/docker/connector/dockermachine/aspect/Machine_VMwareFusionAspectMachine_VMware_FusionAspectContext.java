package org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect;

import java.util.Map;
import org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion;
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.Machine_VMwareFusionAspectMachine_VMware_FusionAspectProperties;

@SuppressWarnings("all")
public class Machine_VMwareFusionAspectMachine_VMware_FusionAspectContext {
  public final static Machine_VMwareFusionAspectMachine_VMware_FusionAspectContext INSTANCE = new Machine_VMwareFusionAspectMachine_VMware_FusionAspectContext();
  
  public static Machine_VMwareFusionAspectMachine_VMware_FusionAspectProperties getSelf(final Machine_VMware_Fusion _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.Machine_VMwareFusionAspectMachine_VMware_FusionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Machine_VMware_Fusion, Machine_VMwareFusionAspectMachine_VMware_FusionAspectProperties> map = new java.util.WeakHashMap<org.occiware.clouddesigner.occi.docker.Machine_VMware_Fusion, org.occiware.clouddesigner.occi.docker.connector.dockermachine.aspect.Machine_VMwareFusionAspectMachine_VMware_FusionAspectProperties>();
  
  public Map<Machine_VMware_Fusion, Machine_VMwareFusionAspectMachine_VMware_FusionAspectProperties> getMap() {
    return map;
  }
}