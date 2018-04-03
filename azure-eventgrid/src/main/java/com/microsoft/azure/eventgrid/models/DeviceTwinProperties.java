/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A portion of the properties that can be written only by the application
 * back-end, and read by the device.
 */
public class DeviceTwinProperties {
    /**
     * Metadata information for the properties JSON document.
     */
    @JsonProperty(value = "metadata")
    private DeviceTwinMetadata metadata;

    /**
     * Version of device twin properties.
     */
    @JsonProperty(value = "version")
    private Double version;

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public DeviceTwinMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the DeviceTwinProperties object itself.
     */
    public DeviceTwinProperties withMetadata(DeviceTwinMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public Double version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the DeviceTwinProperties object itself.
     */
    public DeviceTwinProperties withVersion(Double version) {
        this.version = version;
        return this;
    }

}
