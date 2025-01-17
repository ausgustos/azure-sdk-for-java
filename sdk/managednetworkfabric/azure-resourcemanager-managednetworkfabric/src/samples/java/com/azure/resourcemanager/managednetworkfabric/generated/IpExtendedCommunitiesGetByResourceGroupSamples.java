// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for IpExtendedCommunities GetByResourceGroup. */
public final class IpExtendedCommunitiesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/IpExtendedCommunities_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: IpExtendedCommunities_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void ipExtendedCommunitiesGetMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .ipExtendedCommunities()
            .getByResourceGroupWithResponse(
                "rgIpExtendedCommunityLists", "example_ipExtendedCommunity", com.azure.core.util.Context.NONE);
    }
}
