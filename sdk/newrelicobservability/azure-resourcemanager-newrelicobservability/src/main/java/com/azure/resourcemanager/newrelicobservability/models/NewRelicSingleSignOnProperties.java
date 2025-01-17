// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Single sign on Info of the NewRelic account. */
@Fluent
public final class NewRelicSingleSignOnProperties {
    /*
     * Single sign-on state
     */
    @JsonProperty(value = "singleSignOnState")
    private SingleSignOnStates singleSignOnState;

    /*
     * The Id of the Enterprise App used for Single sign-on.
     */
    @JsonProperty(value = "enterpriseAppId")
    private String enterpriseAppId;

    /*
     * The login URL specific to this NewRelic Organization
     */
    @JsonProperty(value = "singleSignOnUrl")
    private String singleSignOnUrl;

    /*
     * Provisioning state
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /** Creates an instance of NewRelicSingleSignOnProperties class. */
    public NewRelicSingleSignOnProperties() {
    }

    /**
     * Get the singleSignOnState property: Single sign-on state.
     *
     * @return the singleSignOnState value.
     */
    public SingleSignOnStates singleSignOnState() {
        return this.singleSignOnState;
    }

    /**
     * Set the singleSignOnState property: Single sign-on state.
     *
     * @param singleSignOnState the singleSignOnState value to set.
     * @return the NewRelicSingleSignOnProperties object itself.
     */
    public NewRelicSingleSignOnProperties withSingleSignOnState(SingleSignOnStates singleSignOnState) {
        this.singleSignOnState = singleSignOnState;
        return this;
    }

    /**
     * Get the enterpriseAppId property: The Id of the Enterprise App used for Single sign-on.
     *
     * @return the enterpriseAppId value.
     */
    public String enterpriseAppId() {
        return this.enterpriseAppId;
    }

    /**
     * Set the enterpriseAppId property: The Id of the Enterprise App used for Single sign-on.
     *
     * @param enterpriseAppId the enterpriseAppId value to set.
     * @return the NewRelicSingleSignOnProperties object itself.
     */
    public NewRelicSingleSignOnProperties withEnterpriseAppId(String enterpriseAppId) {
        this.enterpriseAppId = enterpriseAppId;
        return this;
    }

    /**
     * Get the singleSignOnUrl property: The login URL specific to this NewRelic Organization.
     *
     * @return the singleSignOnUrl value.
     */
    public String singleSignOnUrl() {
        return this.singleSignOnUrl;
    }

    /**
     * Set the singleSignOnUrl property: The login URL specific to this NewRelic Organization.
     *
     * @param singleSignOnUrl the singleSignOnUrl value to set.
     * @return the NewRelicSingleSignOnProperties object itself.
     */
    public NewRelicSingleSignOnProperties withSingleSignOnUrl(String singleSignOnUrl) {
        this.singleSignOnUrl = singleSignOnUrl;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NewRelicSingleSignOnProperties object itself.
     */
    public NewRelicSingleSignOnProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
