/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.b2bstore.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.b2bstore.core.constants.B2bstoreCoreConstants;
import org.b2bstore.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class B2bstoreCoreManager extends GeneratedB2bstoreCoreManager
{
	public static final B2bstoreCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (B2bstoreCoreManager) em.getExtension(B2bstoreCoreConstants.EXTENSIONNAME);
	}
}
