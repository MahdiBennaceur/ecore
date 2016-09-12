/**
 * Copyright (c) 2016 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 *
 * Generated at Fri Sep 09 14:22:40 CEST 2016 from platform:/resource/org.occiware.clouddesigner.occi.vmware/model/vmware.occie by org.occiware.clouddesigner.occi.gen.connector
 */
package org.occiware.clouddesigner.occi.vmware.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/vmware#
 * - term: hostfirewallruleset
 * - title: 
 */
public class HostfirewallrulesetConnector extends org.occiware.clouddesigner.occi.vmware.impl.HostfirewallrulesetImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(HostfirewallrulesetConnector.class);

	/**
	 * Constructs a hostfirewallruleset connector.
	 */
	HostfirewallrulesetConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Hostfirewallruleset instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostfirewallruleset instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostfirewallruleset instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	/**
	 * Called when this Hostfirewallruleset instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);

		// TODO: Implement this callback or remove this method.
	}

	//
	// Hostfirewallruleset actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostfirewallruleset/action#
     * - term: disableRuleset
     * - title: Blocks the firewall ports belonging to the specified ruleset. If the ruleset has a managed service with a policy of 'auto' and all other rulesets used by the service are blocked, stops the service.
	 */
	@Override
	public void disableRuleset()
	{
		LOGGER.debug("Action disableRuleset() called on " + this);

		// TODO: Implement how to disableRuleset this hostfirewallruleset.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/vmware/hostfirewallruleset/action#
     * - term: enableRuleset
     * - title: Opens the firewall ports belonging to the specified ruleset. If the ruleset has a managed service with a policy of 'auto' that is not running, starts the service.
	 */
	@Override
	public void enableRuleset()
	{
		LOGGER.debug("Action enableRuleset() called on " + this);

		// TODO: Implement how to enableRuleset this hostfirewallruleset.
	}

}	
