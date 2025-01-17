// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyInitiateRequest;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicyInitiateVirtualMachine;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequest;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JitNetworkAccessPoliciesInitiateWithResponseMockTests {
    @Test
    public void testInitiateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"virtualMachines\":[{\"id\":\"xyrujmt\",\"ports\":[]}],\"startTimeUtc\":\"2021-06-08T04:38:24Z\",\"requestor\":\"s\",\"justification\":\"kyohzix\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(202);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        SecurityManager manager =
            SecurityManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        JitNetworkAccessRequest response =
            manager
                .jitNetworkAccessPolicies()
                .initiateWithResponse(
                    "xfqzkvemyzd",
                    "czaqpqifdbmpt",
                    "wtxzuisam",
                    new JitNetworkAccessPolicyInitiateRequest()
                        .withVirtualMachines(
                            Arrays
                                .asList(
                                    new JitNetworkAccessPolicyInitiateVirtualMachine()
                                        .withId("at")
                                        .withPorts(Arrays.asList()),
                                    new JitNetworkAccessPolicyInitiateVirtualMachine()
                                        .withId("zexroqsqjgh")
                                        .withPorts(Arrays.asList()),
                                    new JitNetworkAccessPolicyInitiateVirtualMachine()
                                        .withId("thsplwsttxsr")
                                        .withPorts(Arrays.asList()),
                                    new JitNetworkAccessPolicyInitiateVirtualMachine()
                                        .withId("fq")
                                        .withPorts(Arrays.asList())))
                        .withJustification("iceovxgzw"),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("xyrujmt", response.virtualMachines().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-08T04:38:24Z"), response.startTimeUtc());
        Assertions.assertEquals("s", response.requestor());
        Assertions.assertEquals("kyohzix", response.justification());
    }
}
