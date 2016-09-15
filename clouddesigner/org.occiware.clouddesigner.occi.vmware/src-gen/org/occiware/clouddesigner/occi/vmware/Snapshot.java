/**
 * Copyright (c) 2015-2016 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.occiware.clouddesigner.occi.vmware;

import org.occiware.clouddesigner.occi.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.occiware.clouddesigner.occi.vmware.VmwarePackage#getSnapshot()
 * @model annotation="OCCIE2Ecore title='null'"
 * @generated
 */
public interface Snapshot extends Resource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="OCCIE2Ecore title='null'"
	 * @generated
	 */
	void restore();

} // Snapshot