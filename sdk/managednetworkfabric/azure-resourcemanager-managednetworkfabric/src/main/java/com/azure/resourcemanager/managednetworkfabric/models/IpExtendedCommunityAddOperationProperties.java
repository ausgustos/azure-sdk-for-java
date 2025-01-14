// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP Extended Community add operation properties. */
@Fluent
public class IpExtendedCommunityAddOperationProperties {
    /*
     * IP Extended Community Id list properties.
     */
    @JsonProperty(value = "add")
    private IpExtendedCommunityIdList add;

    /** Creates an instance of IpExtendedCommunityAddOperationProperties class. */
    public IpExtendedCommunityAddOperationProperties() {
    }

    /**
     * Get the add property: IP Extended Community Id list properties.
     *
     * @return the add value.
     */
    public IpExtendedCommunityIdList add() {
        return this.add;
    }

    /**
     * Set the add property: IP Extended Community Id list properties.
     *
     * @param add the add value to set.
     * @return the IpExtendedCommunityAddOperationProperties object itself.
     */
    public IpExtendedCommunityAddOperationProperties withAdd(IpExtendedCommunityIdList add) {
        this.add = add;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (add() != null) {
            add().validate();
        }
    }
}
