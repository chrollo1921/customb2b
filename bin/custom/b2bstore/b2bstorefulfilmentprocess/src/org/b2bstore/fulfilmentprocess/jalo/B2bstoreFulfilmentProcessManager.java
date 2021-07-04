/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.b2bstore.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.b2bstore.fulfilmentprocess.constants.B2bstoreFulfilmentProcessConstants;

public class B2bstoreFulfilmentProcessManager extends GeneratedB2bstoreFulfilmentProcessManager
{
	public static final B2bstoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (B2bstoreFulfilmentProcessManager) em.getExtension(B2bstoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
