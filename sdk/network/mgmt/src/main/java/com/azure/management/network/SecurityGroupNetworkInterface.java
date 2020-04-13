// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SecurityGroupNetworkInterface model. */
@Fluent
public final class SecurityGroupNetworkInterface {
    /*
     * ID of the network interface.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * All security rules associated with the network interface.
     */
    @JsonProperty(value = "securityRuleAssociations")
    private SecurityRuleAssociations securityRuleAssociations;

    /**
     * Get the id property: ID of the network interface.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: ID of the network interface.
     *
     * @param id the id value to set.
     * @return the SecurityGroupNetworkInterface object itself.
     */
    public SecurityGroupNetworkInterface withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the securityRuleAssociations property: All security rules associated with the network interface.
     *
     * @return the securityRuleAssociations value.
     */
    public SecurityRuleAssociations securityRuleAssociations() {
        return this.securityRuleAssociations;
    }

    /**
     * Set the securityRuleAssociations property: All security rules associated with the network interface.
     *
     * @param securityRuleAssociations the securityRuleAssociations value to set.
     * @return the SecurityGroupNetworkInterface object itself.
     */
    public SecurityGroupNetworkInterface withSecurityRuleAssociations(
        SecurityRuleAssociations securityRuleAssociations) {
        this.securityRuleAssociations = securityRuleAssociations;
        return this;
    }
}
