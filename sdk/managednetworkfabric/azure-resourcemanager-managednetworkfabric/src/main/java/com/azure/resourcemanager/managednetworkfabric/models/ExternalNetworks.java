// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ExternalNetworks. */
public interface ExternalNetworks {
    /**
     * Retrieves details of ExternalNetwork.
     *
     * <p>Implements ExternalNetworks GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the ExternalNetwork item along with {@link Response}.
     */
    Response<ExternalNetwork> getWithResponse(
        String resourceGroupName, String l3IsolationDomainName, String externalNetworkName, Context context);

    /**
     * Retrieves details of ExternalNetwork.
     *
     * <p>Implements ExternalNetworks GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the ExternalNetwork item.
     */
    ExternalNetwork get(String resourceGroupName, String l3IsolationDomainName, String externalNetworkName);

    /**
     * Deletes a ExternalNetworks.
     *
     * <p>Implements ExternalNetworks DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String l3IsolationDomainName, String externalNetworkName);

    /**
     * Deletes a ExternalNetworks.
     *
     * <p>Implements ExternalNetworks DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String l3IsolationDomainName, String externalNetworkName, Context context);

    /**
     * Executes list operation to display External Networks within an isolation domain.
     *
     * <p>Implements External Networks list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExternalNetworks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExternalNetwork> list(String resourceGroupName, String l3IsolationDomainName);

    /**
     * Executes list operation to display External Networks within an isolation domain.
     *
     * <p>Implements External Networks list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ExternalNetworks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExternalNetwork> list(String resourceGroupName, String l3IsolationDomainName, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Executes update operation to enable or disable administrative State for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        UpdateAdministrativeState body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Executes update operation to enable or disable administrative State for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        UpdateAdministrativeState body,
        Context context);

    /**
     * Executes BGP state update operation to the underlying resources.
     *
     * <p>Update BGP for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateBgpAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        UpdateAdministrativeState body);

    /**
     * Executes BGP state update operation to the underlying resources.
     *
     * <p>Update BGP for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateBgpAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        UpdateAdministrativeState body,
        Context context);

    /**
     * Execute BfdForBgp update operation to the underlying resources.
     *
     * <p>Update BfdForBgp for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateBfdForBgpAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        UpdateAdministrativeState body);

    /**
     * Execute BfdForBgp update operation to the underlying resources.
     *
     * <p>Update BfdForBgp for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateBfdForBgpAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        UpdateAdministrativeState body,
        Context context);

    /**
     * Executes clearIpv6Neighbors table operation to the underlying resources.
     *
     * <p>clearIpv6Neighbors for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void clearIpv6Neighbors(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        EnableDisableOnResources body);

    /**
     * Executes clearIpv6Neighbors table operation to the underlying resources.
     *
     * <p>clearIpv6Neighbors for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void clearIpv6Neighbors(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        EnableDisableOnResources body,
        Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>clearArpEntries for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void clearArpEntries(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        EnableDisableOnResources body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>clearArpEntries for externalNetwork.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param externalNetworkName Name of the ExternalNetwork.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void clearArpEntries(
        String resourceGroupName,
        String l3IsolationDomainName,
        String externalNetworkName,
        EnableDisableOnResources body,
        Context context);

    /**
     * Retrieves details of ExternalNetwork.
     *
     * <p>Implements ExternalNetworks GET method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the ExternalNetwork item along with {@link Response}.
     */
    ExternalNetwork getById(String id);

    /**
     * Retrieves details of ExternalNetwork.
     *
     * <p>Implements ExternalNetworks GET method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the ExternalNetwork item along with {@link Response}.
     */
    Response<ExternalNetwork> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a ExternalNetworks.
     *
     * <p>Implements ExternalNetworks DELETE method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a ExternalNetworks.
     *
     * <p>Implements ExternalNetworks DELETE method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ExternalNetwork resource.
     *
     * @param name resource name.
     * @return the first stage of the new ExternalNetwork definition.
     */
    ExternalNetwork.DefinitionStages.Blank define(String name);
}
