/**
 * Copyright (c) 2015-2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * -Fawaz Paraiso <fawaz.paraiso@inria.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.docker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Virtual Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getBoot2docker_url <em>Boot2docker url</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getDisk_size <em>Disk size</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox()
 * @model annotation="OCCIE2Ecore title='Machine on VirtualBox'"
 * @generated
 */
public interface Machine_VirtualBox extends Machine {
	/**
	 * Returns the value of the '<em><b>Boot2docker url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boot2docker url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boot2docker url</em>' attribute.
	 * @see #setBoot2docker_url(String)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Boot2docker_url()
	 * @model dataType="org.occiware.clouddesigner.occi.String"
	 *        annotation="OCCIE2Ecore description='The URL of the boot2docker image. Default to the latest available version'"
	 * @generated
	 */
	String getBoot2docker_url();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getBoot2docker_url <em>Boot2docker url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boot2docker url</em>' attribute.
	 * @see #getBoot2docker_url()
	 * @generated
	 */
	void setBoot2docker_url(String value);

	/**
	 * Returns the value of the '<em><b>Disk size</b></em>' attribute.
	 * The default value is <code>"20000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk size</em>' attribute.
	 * @see #setDisk_size(int)
	 * @see org.occiware.clouddesigner.occi.docker.DockerPackage#getMachine_VirtualBox_Disk_size()
	 * @model default="20000" dataType="org.occiware.clouddesigner.occi.Number"
	 *        annotation="OCCIE2Ecore description='Size of disk for the host in MB'"
	 * @generated
	 */
	int getDisk_size();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.docker.Machine_VirtualBox#getDisk_size <em>Disk size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk size</em>' attribute.
	 * @see #getDisk_size()
	 * @generated
	 */
	void setDisk_size(int value);

} // Machine_VirtualBox
