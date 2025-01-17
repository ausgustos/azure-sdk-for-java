// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.BgpPeer;
import com.azure.resourcemanager.networkcloud.models.CniBgpConfiguration;
import com.azure.resourcemanager.networkcloud.models.CommunityAdvertisement;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for DefaultCniNetworks CreateOrUpdate. */
public final class DefaultCniNetworksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/DefaultCniNetworks_Create.json
     */
    /**
     * Sample code: Create or update default CNI network.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void createOrUpdateDefaultCNINetwork(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .defaultCniNetworks()
            .define("defaultCniNetworkName")
            .withRegion("location")
            .withExistingResourceGroup("resourceGroupName")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withName(
                        "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ExtendedLocation/customLocations/clusterExtendedLocationName")
                    .withType("CustomLocation"))
            .withL3IsolationDomainId(
                "/subscriptions/subscriptionId/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/l3IsolationDomains/l3IsolationDomainName")
            .withVlan(12L)
            .withTags(mapOf("key1", "myvalue1", "key2", "myvalue2"))
            .withCniBgpConfiguration(
                new CniBgpConfiguration()
                    .withBgpPeers(Arrays.asList(new BgpPeer().withAsNumber(64497L).withPeerIp("203.0.113.254")))
                    .withCommunityAdvertisements(
                        Arrays
                            .asList(
                                new CommunityAdvertisement()
                                    .withCommunities(Arrays.asList("64512:100"))
                                    .withSubnetPrefix("192.0.2.0/27")))
                    .withServiceExternalPrefixes(Arrays.asList("192.0.2.0/28"))
                    .withServiceLoadBalancerPrefixes(Arrays.asList("192.0.2.16/28")))
            .withIpAllocationType(IpAllocationType.DUAL_STACK)
            .withIpv4ConnectedPrefix("203.0.113.0/24")
            .withIpv6ConnectedPrefix("2001:db8:0:3::/64")
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
