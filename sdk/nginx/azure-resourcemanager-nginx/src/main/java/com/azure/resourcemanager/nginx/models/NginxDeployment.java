// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.nginx.fluent.models.NginxDeploymentInner;
import java.util.Map;

/** An immutable client-side representation of NginxDeployment. */
public interface NginxDeployment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: The identity property.
     *
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * Gets the properties property: The properties property.
     *
     * @return the properties value.
     */
    NginxDeploymentProperties properties();

    /**
     * Gets the sku property: The sku property.
     *
     * @return the sku value.
     */
    ResourceSku sku();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.nginx.fluent.models.NginxDeploymentInner object.
     *
     * @return the inner object.
     */
    NginxDeploymentInner innerModel();

    /** The entirety of the NginxDeployment definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The NginxDeployment definition stages. */
    interface DefinitionStages {
        /** The first stage of the NginxDeployment definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the NginxDeployment definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the NginxDeployment definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the NginxDeployment definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithProperties,
                DefinitionStages.WithSku {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NginxDeployment create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NginxDeployment create(Context context);
        }
        /** The stage of the NginxDeployment definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the NginxDeployment definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity property..
             *
             * @param identity The identity property.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }
        /** The stage of the NginxDeployment definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties property..
             *
             * @param properties The properties property.
             * @return the next definition stage.
             */
            WithCreate withProperties(NginxDeploymentProperties properties);
        }
        /** The stage of the NginxDeployment definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku property..
             *
             * @param sku The sku property.
             * @return the next definition stage.
             */
            WithCreate withSku(ResourceSku sku);
        }
    }
    /**
     * Begins update for the NginxDeployment resource.
     *
     * @return the stage of resource update.
     */
    NginxDeployment.Update update();

    /** The template for NginxDeployment update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithSku, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NginxDeployment apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NginxDeployment apply(Context context);
    }
    /** The NginxDeployment update stages. */
    interface UpdateStages {
        /** The stage of the NginxDeployment update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Dictionary of &lt;string&gt;.
             *
             * @param tags Dictionary of &lt;string&gt;.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the NginxDeployment update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity property..
             *
             * @param identity The identity property.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityProperties identity);
        }
        /** The stage of the NginxDeployment update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku property..
             *
             * @param sku The sku property.
             * @return the next definition stage.
             */
            Update withSku(ResourceSku sku);
        }
        /** The stage of the NginxDeployment update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties property..
             *
             * @param properties The properties property.
             * @return the next definition stage.
             */
            Update withProperties(NginxDeploymentUpdateProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NginxDeployment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NginxDeployment refresh(Context context);
}
