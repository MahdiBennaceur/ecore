 /*******************************************************************************
 * Copyright (c) 2015 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	- Fawaz PARAISO 
 *******************************************************************************/
package org.occiware.clouddesigner.occi.docker.connector.dockermachine.manager

import org.occiware.clouddesigner.occi.docker.Machine
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.command.CommandFactory
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.ProcessManager
import org.occiware.clouddesigner.occi.infrastructure.ComputeStatus
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.occiware.clouddesigner.occi.docker.connector.dockermachine.util.DockerUtil

class DockerMachineManager {
	// Initialize logger for CommandFactory.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(DockerMachineManager))
	val private static cf = new CommandFactory

	def static boolean createHostCmd(Runtime runtime, Machine machine) {
		val String command = ""
		LOGGER.info(" Run ::==> " + command)
		ProcessManager.runCommand(command, runtime, true)
		// Set machine state
		machine.state = ComputeStatus.get(0)
		return setEnvCmd(runtime, machine.name)
	}

	def static boolean listMachinesCmd(Runtime runtime) {
		var boolean result = false 
		if (DockerUtil.getOS.equalsIgnoreCase("osx")){
			val String command = cf.createLsCommand()
			result = ProcessManager.runCommand(command, runtime, true)
		}else{
			result = ProcessManager.runCommand("docker-machine ls", runtime, true)
		}
		return result
	}

	def static boolean regenerateCert(Runtime runtime, String machineName){
		val String command = cf.createCertCommand(machineName)
		val temp = ProcessManager.runCommand(command, runtime, true)
		return temp
	}

	def static String inspectHostCmd(Runtime runtime, String machine) {
		val String command = cf.createInfoCommand(machine)
		return ProcessManager.getOutputCommand(command, runtime)
	}

	def static String listHostCmd(Runtime runtime) {
		val String command = cf.createLsCmd
		return ProcessManager.getOutputCommand(command, runtime)
	}

	def static setEnvCmd(Runtime runtime, String machineName) {
		val String command = cf.createEnvCmd(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static getEnvCmd(Runtime runtime, String machineName) {
		val String command = cf.getEnvCmd(machineName)
		return ProcessManager.getOutputCommand(command, runtime)
	}

	def static startCmd(Runtime runtime, String machineName) {
		val String command = cf.createStartCommand(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static stopCmd(Runtime runtime, String machineName) {
		val String command = cf.createStopCommand(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static restartCmd(Runtime runtime, String machineName) {
		val String command = cf.createReStartCommand(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static removeCmd(Runtime runtime, String machineName) {
		val String command = cf.createRemoveCommand(machineName)
		return ProcessManager.runCommand(command, runtime, true)
	}

	def static urlCmd(Runtime runtime, String machineName) {
		val String command = cf.createUrlCommand(machineName)
		val temp = ProcessManager.getOutputCommand(command, runtime)
		return temp
	}
	
	def static ipCmd(Runtime runtime, String machineName) {
		val String command = cf.createUrlCommand(machineName)
		val temp = ProcessManager.getOutputCommand(command, runtime).replace("tcp://", "")
		val index = temp.indexOf(":")
		val newTemp = temp.substring(0, index)
		return newTemp
	}
	
}
