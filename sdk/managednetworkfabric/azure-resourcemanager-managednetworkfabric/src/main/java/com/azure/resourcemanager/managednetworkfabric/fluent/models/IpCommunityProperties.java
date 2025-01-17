// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.WellKnownCommunities;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IpCommunityProperties define the resource properties. */
@Fluent
public final class IpCommunityProperties extends AnnotationResource {
    /*
     * Action to be taken on the configuration. Example: Permit | Deny.
     */
    @JsonProperty(value = "action", required = true)
    private CommunityActionTypes action;

    /*
     * Supported well known Community List.
     */
    @JsonProperty(value = "wellKnownCommunities")
    private List<WellKnownCommunities> wellKnownCommunities;

    /*
     * List the communityMembers of IP Community .
     */
    @JsonProperty(value = "communityMembers", required = true)
    private List<String> communityMembers;

    /*
     * Gets the provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of IpCommunityProperties class. */
    public IpCommunityProperties() {
    }

    /**
     * Get the action property: Action to be taken on the configuration. Example: Permit | Deny.
     *
     * @return the action value.
     */
    public CommunityActionTypes action() {
        return this.action;
    }

    /**
     * Set the action property: Action to be taken on the configuration. Example: Permit | Deny.
     *
     * @param action the action value to set.
     * @return the IpCommunityProperties object itself.
     */
    public IpCommunityProperties withAction(CommunityActionTypes action) {
        this.action = action;
        return this;
    }

    /**
     * Get the wellKnownCommunities property: Supported well known Community List.
     *
     * @return the wellKnownCommunities value.
     */
    public List<WellKnownCommunities> wellKnownCommunities() {
        return this.wellKnownCommunities;
    }

    /**
     * Set the wellKnownCommunities property: Supported well known Community List.
     *
     * @param wellKnownCommunities the wellKnownCommunities value to set.
     * @return the IpCommunityProperties object itself.
     */
    public IpCommunityProperties withWellKnownCommunities(List<WellKnownCommunities> wellKnownCommunities) {
        this.wellKnownCommunities = wellKnownCommunities;
        return this;
    }

    /**
     * Get the communityMembers property: List the communityMembers of IP Community .
     *
     * @return the communityMembers value.
     */
    public List<String> communityMembers() {
        return this.communityMembers;
    }

    /**
     * Set the communityMembers property: List the communityMembers of IP Community .
     *
     * @param communityMembers the communityMembers value to set.
     * @return the IpCommunityProperties object itself.
     */
    public IpCommunityProperties withCommunityMembers(List<String> communityMembers) {
        this.communityMembers = communityMembers;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public IpCommunityProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property action in model IpCommunityProperties"));
        }
        if (communityMembers() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property communityMembers in model IpCommunityProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpCommunityProperties.class);
}
