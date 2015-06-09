/**
 * Copyright (c) 2012 eXtensible Catalog Organization
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the MIT/X11 license. The text of the license can be
 * found at http://www.opensource.org/licenses/mit-license.php.
 */

package org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.dozer;

import org.extensiblecatalog.ncip.v2.binding.jaxb.dozer.BaseSchemeValuePairConverter;
import org.extensiblecatalog.ncip.v2.binding.ilsdiv1_1.jaxb.elements.SchemeValuePair;

public class ILSDIv1_1_SchemeValuePairConverter extends BaseSchemeValuePairConverter {

    public ILSDIv1_1_SchemeValuePairConverter() {

        super(SchemeValuePair.class, org.extensiblecatalog.ncip.v2.service.SchemeValuePair.class);

    }
}
