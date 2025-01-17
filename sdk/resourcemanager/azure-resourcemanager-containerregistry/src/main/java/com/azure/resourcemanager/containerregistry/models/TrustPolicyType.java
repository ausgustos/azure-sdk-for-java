// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of trust policy. */
public final class TrustPolicyType extends ExpandableStringEnum<TrustPolicyType> {
    /** Static value Notary for TrustPolicyType. */
    public static final TrustPolicyType NOTARY = fromString("Notary");

    /**
     * Creates a new instance of TrustPolicyType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TrustPolicyType() {
    }

    /**
     * Creates or finds a TrustPolicyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TrustPolicyType.
     */
    @JsonCreator
    public static TrustPolicyType fromString(String name) {
        return fromString(name, TrustPolicyType.class);
    }

    /**
     * Gets known TrustPolicyType values.
     *
     * @return known TrustPolicyType values.
     */
    public static Collection<TrustPolicyType> values() {
        return values(TrustPolicyType.class);
    }
}
