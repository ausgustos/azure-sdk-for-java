// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkInterfacePatch;
import org.junit.jupiter.api.Assertions;

public final class NetworkInterfacePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkInterfacePatch model =
            BinaryData.fromString("{\"properties\":{\"annotation\":\"wr\"}}").toObject(NetworkInterfacePatch.class);
        Assertions.assertEquals("wr", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkInterfacePatch model = new NetworkInterfacePatch().withAnnotation("wr");
        model = BinaryData.fromObject(model).toObject(NetworkInterfacePatch.class);
        Assertions.assertEquals("wr", model.annotation());
    }
}
