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
package org.occiware.clouddesigner.occi.infrastructure.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.occiware.clouddesigner.occi.impl.LinkImpl;

import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.infrastructure.StorageLinkStatus;
import org.occiware.clouddesigner.occi.infrastructure.Storagelink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storagelink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl#getDeviceid <em>Deviceid</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl#getMountpoint <em>Mountpoint</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl#getState <em>State</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.infrastructure.impl.StoragelinkImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoragelinkImpl extends LinkImpl implements Storagelink {
	/**
	 * The default value of the '{@link #getDeviceid() <em>Deviceid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceid()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICEID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceid() <em>Deviceid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceid()
	 * @generated
	 * @ordered
	 */
	protected String deviceid = DEVICEID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMountpoint() <em>Mountpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNTPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMountpoint() <em>Mountpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountpoint()
	 * @generated
	 * @ordered
	 */
	protected String mountpoint = MOUNTPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StorageLinkStatus STATE_EDEFAULT = StorageLinkStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StorageLinkStatus state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragelinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.STORAGELINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceid() {
		return deviceid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceid(String newDeviceid) {
		String oldDeviceid = deviceid;
		deviceid = newDeviceid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGELINK__DEVICEID, oldDeviceid, deviceid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMountpoint() {
		return mountpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountpoint(String newMountpoint) {
		String oldMountpoint = mountpoint;
		mountpoint = newMountpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGELINK__MOUNTPOINT, oldMountpoint, mountpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageLinkStatus getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StorageLinkStatus newState) {
		StorageLinkStatus oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGELINK__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGELINK__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.STORAGELINK__DEVICEID:
				return getDeviceid();
			case InfrastructurePackage.STORAGELINK__MOUNTPOINT:
				return getMountpoint();
			case InfrastructurePackage.STORAGELINK__STATE:
				return getState();
			case InfrastructurePackage.STORAGELINK__MESSAGE:
				return getMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfrastructurePackage.STORAGELINK__DEVICEID:
				setDeviceid((String)newValue);
				return;
			case InfrastructurePackage.STORAGELINK__MOUNTPOINT:
				setMountpoint((String)newValue);
				return;
			case InfrastructurePackage.STORAGELINK__STATE:
				setState((StorageLinkStatus)newValue);
				return;
			case InfrastructurePackage.STORAGELINK__MESSAGE:
				setMessage((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.STORAGELINK__DEVICEID:
				setDeviceid(DEVICEID_EDEFAULT);
				return;
			case InfrastructurePackage.STORAGELINK__MOUNTPOINT:
				setMountpoint(MOUNTPOINT_EDEFAULT);
				return;
			case InfrastructurePackage.STORAGELINK__STATE:
				setState(STATE_EDEFAULT);
				return;
			case InfrastructurePackage.STORAGELINK__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InfrastructurePackage.STORAGELINK__DEVICEID:
				return DEVICEID_EDEFAULT == null ? deviceid != null : !DEVICEID_EDEFAULT.equals(deviceid);
			case InfrastructurePackage.STORAGELINK__MOUNTPOINT:
				return MOUNTPOINT_EDEFAULT == null ? mountpoint != null : !MOUNTPOINT_EDEFAULT.equals(mountpoint);
			case InfrastructurePackage.STORAGELINK__STATE:
				return state != STATE_EDEFAULT;
			case InfrastructurePackage.STORAGELINK__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deviceid: ");
		result.append(deviceid);
		result.append(", mountpoint: ");
		result.append(mountpoint);
		result.append(", state: ");
		result.append(state);
		result.append(", message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //StoragelinkImpl
