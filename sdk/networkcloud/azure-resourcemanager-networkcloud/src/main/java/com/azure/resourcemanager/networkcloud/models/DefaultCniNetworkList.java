// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.DefaultCniNetworkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DefaultCniNetworkList represents a list of default CNI networks. */
@Fluent
public final class DefaultCniNetworkList {
    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of default CNI networks.
     */
    @JsonProperty(value = "value")
    private List<DefaultCniNetworkInner> value;

    /** Creates an instance of DefaultCniNetworkList class. */
    public DefaultCniNetworkList() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the DefaultCniNetworkList object itself.
     */
    public DefaultCniNetworkList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of default CNI networks.
     *
     * @return the value value.
     */
    public List<DefaultCniNetworkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of default CNI networks.
     *
     * @param value the value value to set.
     * @return the DefaultCniNetworkList object itself.
     */
    public DefaultCniNetworkList withValue(List<DefaultCniNetworkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
