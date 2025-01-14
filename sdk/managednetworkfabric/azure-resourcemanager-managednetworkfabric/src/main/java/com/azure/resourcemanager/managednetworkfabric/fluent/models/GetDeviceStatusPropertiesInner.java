// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.OperationalStatus;
import com.azure.resourcemanager.managednetworkfabric.models.PowerCycleState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Get Device status response properties. */
@Fluent
public final class GetDeviceStatusPropertiesInner {
    /*
     * Primary or Secondary power end.
     */
    @JsonProperty(value = "operationalStatus", required = true)
    private OperationalStatus operationalStatus;

    /*
     * On or Off power cycle state.
     */
    @JsonProperty(value = "powerCycleState", required = true)
    private PowerCycleState powerCycleState;

    /*
     * The serial number of the device
     */
    @JsonProperty(value = "serialNumber", required = true)
    private String serialNumber;

    /** Creates an instance of GetDeviceStatusPropertiesInner class. */
    public GetDeviceStatusPropertiesInner() {
    }

    /**
     * Get the operationalStatus property: Primary or Secondary power end.
     *
     * @return the operationalStatus value.
     */
    public OperationalStatus operationalStatus() {
        return this.operationalStatus;
    }

    /**
     * Set the operationalStatus property: Primary or Secondary power end.
     *
     * @param operationalStatus the operationalStatus value to set.
     * @return the GetDeviceStatusPropertiesInner object itself.
     */
    public GetDeviceStatusPropertiesInner withOperationalStatus(OperationalStatus operationalStatus) {
        this.operationalStatus = operationalStatus;
        return this;
    }

    /**
     * Get the powerCycleState property: On or Off power cycle state.
     *
     * @return the powerCycleState value.
     */
    public PowerCycleState powerCycleState() {
        return this.powerCycleState;
    }

    /**
     * Set the powerCycleState property: On or Off power cycle state.
     *
     * @param powerCycleState the powerCycleState value to set.
     * @return the GetDeviceStatusPropertiesInner object itself.
     */
    public GetDeviceStatusPropertiesInner withPowerCycleState(PowerCycleState powerCycleState) {
        this.powerCycleState = powerCycleState;
        return this;
    }

    /**
     * Get the serialNumber property: The serial number of the device.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Set the serialNumber property: The serial number of the device.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the GetDeviceStatusPropertiesInner object itself.
     */
    public GetDeviceStatusPropertiesInner withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operationalStatus() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operationalStatus in model GetDeviceStatusPropertiesInner"));
        }
        if (powerCycleState() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property powerCycleState in model GetDeviceStatusPropertiesInner"));
        }
        if (serialNumber() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serialNumber in model GetDeviceStatusPropertiesInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GetDeviceStatusPropertiesInner.class);
}
