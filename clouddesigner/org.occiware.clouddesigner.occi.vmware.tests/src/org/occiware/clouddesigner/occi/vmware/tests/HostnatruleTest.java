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
package org.occiware.clouddesigner.occi.vmware.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.occiware.clouddesigner.occi.vmware.Hostnatrule;
import org.occiware.clouddesigner.occi.vmware.VmwareFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hostnatrule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HostnatruleTest extends TestCase {

	/**
	 * The fixture for this Hostnatrule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hostnatrule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HostnatruleTest.class);
	}

	/**
	 * Constructs a new Hostnatrule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostnatruleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hostnatrule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Hostnatrule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hostnatrule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hostnatrule getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VmwareFactory.eINSTANCE.createHostnatrule());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HostnatruleTest
