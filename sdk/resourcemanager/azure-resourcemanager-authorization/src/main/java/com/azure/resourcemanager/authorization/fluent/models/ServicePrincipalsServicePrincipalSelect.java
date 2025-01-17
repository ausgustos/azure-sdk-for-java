// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServicePrincipalsServicePrincipalSelect. */
public final class ServicePrincipalsServicePrincipalSelect
    extends ExpandableStringEnum<ServicePrincipalsServicePrincipalSelect> {
    /** Static value id for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect ID = fromString("id");

    /** Static value deletedDateTime for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value accountEnabled for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect ACCOUNT_ENABLED = fromString("accountEnabled");

    /** Static value addIns for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect ADD_INS = fromString("addIns");

    /** Static value alternativeNames for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect ALTERNATIVE_NAMES = fromString("alternativeNames");

    /** Static value appDescription for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APP_DESCRIPTION = fromString("appDescription");

    /** Static value appDisplayName for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APP_DISPLAY_NAME = fromString("appDisplayName");

    /** Static value appId for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APP_ID = fromString("appId");

    /** Static value applicationTemplateId for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APPLICATION_TEMPLATE_ID =
        fromString("applicationTemplateId");

    /** Static value appOwnerOrganizationId for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APP_OWNER_ORGANIZATION_ID =
        fromString("appOwnerOrganizationId");

    /** Static value appRoleAssignmentRequired for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APP_ROLE_ASSIGNMENT_REQUIRED =
        fromString("appRoleAssignmentRequired");

    /** Static value appRoles for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APP_ROLES = fromString("appRoles");

    /** Static value description for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect DESCRIPTION = fromString("description");

    /** Static value displayName for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect DISPLAY_NAME = fromString("displayName");

    /** Static value homepage for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect HOMEPAGE = fromString("homepage");

    /** Static value info for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect INFO = fromString("info");

    /** Static value keyCredentials for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect KEY_CREDENTIALS = fromString("keyCredentials");

    /** Static value loginUrl for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect LOGIN_URL = fromString("loginUrl");

    /** Static value logoutUrl for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect LOGOUT_URL = fromString("logoutUrl");

    /** Static value notes for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect NOTES = fromString("notes");

    /** Static value notificationEmailAddresses for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect NOTIFICATION_EMAIL_ADDRESSES =
        fromString("notificationEmailAddresses");

    /** Static value oauth2PermissionScopes for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect OAUTH2PERMISSION_SCOPES =
        fromString("oauth2PermissionScopes");

    /** Static value passwordCredentials for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect PASSWORD_CREDENTIALS =
        fromString("passwordCredentials");

    /** Static value preferredSingleSignOnMode for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect PREFERRED_SINGLE_SIGN_ON_MODE =
        fromString("preferredSingleSignOnMode");

    /** Static value preferredTokenSigningKeyThumbprint for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect PREFERRED_TOKEN_SIGNING_KEY_THUMBPRINT =
        fromString("preferredTokenSigningKeyThumbprint");

    /** Static value replyUrls for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect REPLY_URLS = fromString("replyUrls");

    /** Static value samlSingleSignOnSettings for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect SAML_SINGLE_SIGN_ON_SETTINGS =
        fromString("samlSingleSignOnSettings");

    /** Static value servicePrincipalNames for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect SERVICE_PRINCIPAL_NAMES =
        fromString("servicePrincipalNames");

    /** Static value servicePrincipalType for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect SERVICE_PRINCIPAL_TYPE =
        fromString("servicePrincipalType");

    /** Static value signInAudience for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect SIGN_IN_AUDIENCE = fromString("signInAudience");

    /** Static value tags for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect TAGS = fromString("tags");

    /** Static value tokenEncryptionKeyId for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect TOKEN_ENCRYPTION_KEY_ID =
        fromString("tokenEncryptionKeyId");

    /** Static value appRoleAssignedTo for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APP_ROLE_ASSIGNED_TO = fromString("appRoleAssignedTo");

    /** Static value appRoleAssignments for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect APP_ROLE_ASSIGNMENTS = fromString("appRoleAssignments");

    /** Static value claimsMappingPolicies for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect CLAIMS_MAPPING_POLICIES =
        fromString("claimsMappingPolicies");

    /** Static value createdObjects for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect CREATED_OBJECTS = fromString("createdObjects");

    /** Static value delegatedPermissionClassifications for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect DELEGATED_PERMISSION_CLASSIFICATIONS =
        fromString("delegatedPermissionClassifications");

    /** Static value endpoints for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect ENDPOINTS = fromString("endpoints");

    /** Static value homeRealmDiscoveryPolicies for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect HOME_REALM_DISCOVERY_POLICIES =
        fromString("homeRealmDiscoveryPolicies");

    /** Static value memberOf for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect MEMBER_OF = fromString("memberOf");

    /** Static value oauth2PermissionGrants for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect OAUTH2PERMISSION_GRANTS =
        fromString("oauth2PermissionGrants");

    /** Static value ownedObjects for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect OWNED_OBJECTS = fromString("ownedObjects");

    /** Static value owners for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect OWNERS = fromString("owners");

    /** Static value tokenIssuancePolicies for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect TOKEN_ISSUANCE_POLICIES =
        fromString("tokenIssuancePolicies");

    /** Static value tokenLifetimePolicies for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect TOKEN_LIFETIME_POLICIES =
        fromString("tokenLifetimePolicies");

    /** Static value transitiveMemberOf for ServicePrincipalsServicePrincipalSelect. */
    public static final ServicePrincipalsServicePrincipalSelect TRANSITIVE_MEMBER_OF = fromString("transitiveMemberOf");

    /**
     * Creates or finds a ServicePrincipalsServicePrincipalSelect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServicePrincipalsServicePrincipalSelect.
     */
    @JsonCreator
    public static ServicePrincipalsServicePrincipalSelect fromString(String name) {
        return fromString(name, ServicePrincipalsServicePrincipalSelect.class);
    }

    /**
     * Gets known ServicePrincipalsServicePrincipalSelect values.
     *
     * @return known ServicePrincipalsServicePrincipalSelect values.
     */
    public static Collection<ServicePrincipalsServicePrincipalSelect> values() {
        return values(ServicePrincipalsServicePrincipalSelect.class);
    }
}
