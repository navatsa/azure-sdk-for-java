/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VpnAuthenticationType.
 */
public final class VpnAuthenticationType extends ExpandableStringEnum<VpnAuthenticationType> {
    /** Static value Certificate for VpnAuthenticationType. */
    public static final VpnAuthenticationType CERTIFICATE = fromString("Certificate");

    /** Static value Radius for VpnAuthenticationType. */
    public static final VpnAuthenticationType RADIUS = fromString("Radius");

    /** Static value AAD for VpnAuthenticationType. */
    public static final VpnAuthenticationType AAD = fromString("AAD");

    /**
     * Creates or finds a VpnAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding VpnAuthenticationType
     */
    @JsonCreator
    public static VpnAuthenticationType fromString(String name) {
        return fromString(name, VpnAuthenticationType.class);
    }

    /**
     * @return known VpnAuthenticationType values
     */
    public static Collection<VpnAuthenticationType> values() {
        return values(VpnAuthenticationType.class);
    }
}