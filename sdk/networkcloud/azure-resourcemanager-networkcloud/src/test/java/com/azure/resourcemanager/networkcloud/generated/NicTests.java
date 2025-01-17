// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.Nic;

public final class NicTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Nic model =
            BinaryData
                .fromString(
                    "{\"lldpNeighbor\":{\"portDescription\":\"yxolniwp\",\"portName\":\"ukjfkgiawxklr\",\"systemDescription\":\"lwckbasyypnddhs\",\"systemName\":\"bacphejko\"},\"macAddress\":\"nqgoulzndli\",\"name\":\"yqkgfg\"}")
                .toObject(Nic.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Nic model = new Nic();
        model = BinaryData.fromObject(model).toObject(Nic.class);
    }
}
