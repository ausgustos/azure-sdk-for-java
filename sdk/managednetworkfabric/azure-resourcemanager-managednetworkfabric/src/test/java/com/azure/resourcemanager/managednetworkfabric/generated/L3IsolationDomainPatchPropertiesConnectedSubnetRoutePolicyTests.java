// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy;
import org.junit.jupiter.api.Assertions;

public final class L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy model =
            BinaryData
                .fromString("{\"exportRoutePolicyId\":\"ids\",\"administrativeState\":\"Disabled\"}")
                .toObject(L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy.class);
        Assertions.assertEquals("ids", model.exportRoutePolicyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy model =
            new L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy().withExportRoutePolicyId("ids");
        model = BinaryData.fromObject(model).toObject(L3IsolationDomainPatchPropertiesConnectedSubnetRoutePolicy.class);
        Assertions.assertEquals("ids", model.exportRoutePolicyId());
    }
}
