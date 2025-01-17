// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.fluent.models.ProjectInner;
import org.junit.jupiter.api.Assertions;

public final class ProjectInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProjectInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"tjaodxobnb\",\"provisioningState\":\"Succeeded\"},\"id\":\"pxokajionp\",\"name\":\"mexgstxgcp\",\"type\":\"dg\"}")
                .toObject(ProjectInner.class);
        Assertions.assertEquals("tjaodxobnb", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProjectInner model = new ProjectInner().withDescription("tjaodxobnb");
        model = BinaryData.fromObject(model).toObject(ProjectInner.class);
        Assertions.assertEquals("tjaodxobnb", model.description());
    }
}
