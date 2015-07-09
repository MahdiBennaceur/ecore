package org.occiware.clouddesigner.occi.hypervisor.design.services

import java.lang.reflect.InvocationTargetException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.dialogs.ProgressMonitorDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.Shell
import org.occiware.clouddesigner.occi.AbstractOCCIKindResolver
import org.occiware.clouddesigner.occi.hypervisor.Machine
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableHypervisorFactory
import org.occiware.clouddesigner.occi.hypervisor.connector.libvirt.ExecutableHypervisorModel

class HypervisorServices extends AbstractOCCIKindResolver{
		// Initialize the executable Docker factory.
	val init = ExecutableHypervisorFactory.init()
	
	def void start(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					val main = new ExecutableHypervisorModel(machine)
					main.start
					println("Start button is activated ...")
				}
			}
		}
		var dialog = new ProgressMonitorDialog(getShell())
		dialog.run(false, true, runnable)
	}

	def void stop(EObject eo) {
		var runnable = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
				if (eo instanceof Machine) {
					var machine = eo as Machine
					val main = new ExecutableHypervisorModel(machine)
					main.stop
					println("Stop button is activated ...")
				}
			}
		}
		var dialog = new ProgressMonitorDialog(getShell())
		dialog.run(false, true, runnable)
	}

	def Shell getShell() {
		return Display.current.activeShell
	}
}