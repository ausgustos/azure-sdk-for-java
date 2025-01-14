// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import com.azure.resourcemanager.networkcloud.models.L3NetworkDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.L3NetworkProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** L3Network represents a network that utilizes a single isolation domain set up for layer-3 resources. */
@Fluent
public final class L3NetworkInner extends Resource {
    /*
     * ExtendedLocation represents the Azure custom location where the resource will be created.
     *
     * The extended location of the cluster associated with the resource.
     */
    @JsonProperty(value = "extendedLocation", required = true)
    private ExtendedLocation extendedLocation;

    /*
     * L3NetworkProperties represents properties of the L3 network.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private L3NetworkProperties innerProperties = new L3NetworkProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of L3NetworkInner class. */
    public L3NetworkInner() {
    }

    /**
     * Get the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: L3NetworkProperties represents properties of the L3 network.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private L3NetworkProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public L3NetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public L3NetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the clusterId property: The resource ID of the Network Cloud cluster this L3 network is associated with.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.innerProperties() == null ? null : this.innerProperties().clusterId();
    }

    /**
     * Get the detailedStatus property: The more detailed status of the L3 network.
     *
     * @return the detailedStatus value.
     */
    public L3NetworkDetailedStatus detailedStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatus();
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedStatusMessage();
    }

    /**
     * Get the hybridAksClustersAssociatedIds property: The list of Hybrid AKS cluster resource IDs that are associated
     * with this L3 network.
     *
     * @return the hybridAksClustersAssociatedIds value.
     */
    public List<String> hybridAksClustersAssociatedIds() {
        return this.innerProperties() == null ? null : this.innerProperties().hybridAksClustersAssociatedIds();
    }

    /**
     * Get the hybridAksIpamEnabled property: The indicator of whether or not to disable IPAM allocation on the network
     * attachment definition injected into the Hybrid AKS Cluster.
     *
     * @return the hybridAksIpamEnabled value.
     */
    public HybridAksIpamEnabled hybridAksIpamEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().hybridAksIpamEnabled();
    }

    /**
     * Set the hybridAksIpamEnabled property: The indicator of whether or not to disable IPAM allocation on the network
     * attachment definition injected into the Hybrid AKS Cluster.
     *
     * @param hybridAksIpamEnabled the hybridAksIpamEnabled value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withHybridAksIpamEnabled(HybridAksIpamEnabled hybridAksIpamEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3NetworkProperties();
        }
        this.innerProperties().withHybridAksIpamEnabled(hybridAksIpamEnabled);
        return this;
    }

    /**
     * Get the hybridAksPluginType property: The network plugin type for Hybrid AKS.
     *
     * @return the hybridAksPluginType value.
     */
    public HybridAksPluginType hybridAksPluginType() {
        return this.innerProperties() == null ? null : this.innerProperties().hybridAksPluginType();
    }

    /**
     * Set the hybridAksPluginType property: The network plugin type for Hybrid AKS.
     *
     * @param hybridAksPluginType the hybridAksPluginType value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withHybridAksPluginType(HybridAksPluginType hybridAksPluginType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3NetworkProperties();
        }
        this.innerProperties().withHybridAksPluginType(hybridAksPluginType);
        return this;
    }

    /**
     * Get the interfaceName property: The default interface name for this L3 network in the virtual machine. This name
     * can be overridden by the name supplied in the network attachment configuration of that virtual machine.
     *
     * @return the interfaceName value.
     */
    public String interfaceName() {
        return this.innerProperties() == null ? null : this.innerProperties().interfaceName();
    }

    /**
     * Set the interfaceName property: The default interface name for this L3 network in the virtual machine. This name
     * can be overridden by the name supplied in the network attachment configuration of that virtual machine.
     *
     * @param interfaceName the interfaceName value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withInterfaceName(String interfaceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3NetworkProperties();
        }
        this.innerProperties().withInterfaceName(interfaceName);
        return this;
    }

    /**
     * Get the ipAllocationType property: The type of the IP address allocation, defaulted to "DualStack".
     *
     * @return the ipAllocationType value.
     */
    public IpAllocationType ipAllocationType() {
        return this.innerProperties() == null ? null : this.innerProperties().ipAllocationType();
    }

    /**
     * Set the ipAllocationType property: The type of the IP address allocation, defaulted to "DualStack".
     *
     * @param ipAllocationType the ipAllocationType value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withIpAllocationType(IpAllocationType ipAllocationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3NetworkProperties();
        }
        this.innerProperties().withIpAllocationType(ipAllocationType);
        return this;
    }

    /**
     * Get the ipv4ConnectedPrefix property: The IPV4 prefix (CIDR) assigned to this L3 network. Required when the IP
     * allocation type is IPV4 or DualStack.
     *
     * @return the ipv4ConnectedPrefix value.
     */
    public String ipv4ConnectedPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().ipv4ConnectedPrefix();
    }

    /**
     * Set the ipv4ConnectedPrefix property: The IPV4 prefix (CIDR) assigned to this L3 network. Required when the IP
     * allocation type is IPV4 or DualStack.
     *
     * @param ipv4ConnectedPrefix the ipv4ConnectedPrefix value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withIpv4ConnectedPrefix(String ipv4ConnectedPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3NetworkProperties();
        }
        this.innerProperties().withIpv4ConnectedPrefix(ipv4ConnectedPrefix);
        return this;
    }

    /**
     * Get the ipv6ConnectedPrefix property: The IPV6 prefix (CIDR) assigned to this L3 network. Required when the IP
     * allocation type is IPV6 or DualStack.
     *
     * @return the ipv6ConnectedPrefix value.
     */
    public String ipv6ConnectedPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().ipv6ConnectedPrefix();
    }

    /**
     * Set the ipv6ConnectedPrefix property: The IPV6 prefix (CIDR) assigned to this L3 network. Required when the IP
     * allocation type is IPV6 or DualStack.
     *
     * @param ipv6ConnectedPrefix the ipv6ConnectedPrefix value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withIpv6ConnectedPrefix(String ipv6ConnectedPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3NetworkProperties();
        }
        this.innerProperties().withIpv6ConnectedPrefix(ipv6ConnectedPrefix);
        return this;
    }

    /**
     * Get the l3IsolationDomainId property: The resource ID of the Network Fabric l3IsolationDomain.
     *
     * @return the l3IsolationDomainId value.
     */
    public String l3IsolationDomainId() {
        return this.innerProperties() == null ? null : this.innerProperties().l3IsolationDomainId();
    }

    /**
     * Set the l3IsolationDomainId property: The resource ID of the Network Fabric l3IsolationDomain.
     *
     * @param l3IsolationDomainId the l3IsolationDomainId value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withL3IsolationDomainId(String l3IsolationDomainId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3NetworkProperties();
        }
        this.innerProperties().withL3IsolationDomainId(l3IsolationDomainId);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the L3 network.
     *
     * @return the provisioningState value.
     */
    public L3NetworkProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the virtualMachinesAssociatedIds property: The list of virtual machine resource IDs, excluding any Hybrid AKS
     * virtual machines, that are currently using this L3 network.
     *
     * @return the virtualMachinesAssociatedIds value.
     */
    public List<String> virtualMachinesAssociatedIds() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociatedIds();
    }

    /**
     * Get the vlan property: The VLAN from the l3IsolationDomain that is used for this network.
     *
     * @return the vlan value.
     */
    public long vlan() {
        return this.innerProperties() == null ? 0L : this.innerProperties().vlan();
    }

    /**
     * Set the vlan property: The VLAN from the l3IsolationDomain that is used for this network.
     *
     * @param vlan the vlan value to set.
     * @return the L3NetworkInner object itself.
     */
    public L3NetworkInner withVlan(long vlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3NetworkProperties();
        }
        this.innerProperties().withVlan(vlan);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property extendedLocation in model L3NetworkInner"));
        } else {
            extendedLocation().validate();
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model L3NetworkInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(L3NetworkInner.class);
}
