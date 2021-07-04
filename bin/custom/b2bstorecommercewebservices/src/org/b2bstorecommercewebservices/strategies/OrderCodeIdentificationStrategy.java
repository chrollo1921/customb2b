/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.b2bstorecommercewebservices.strategies;


/**
 * Strategy for identifying is given string is GUID.
 */
public interface OrderCodeIdentificationStrategy
{
	boolean isID(String potentialId);
}
