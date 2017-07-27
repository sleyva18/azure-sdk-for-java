/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PolicyStatus.
 */
public final class PolicyStatus {
    /** Static value Enabled for PolicyStatus. */
    public static final PolicyStatus ENABLED = new PolicyStatus("Enabled");

    /** Static value Disabled for PolicyStatus. */
    public static final PolicyStatus DISABLED = new PolicyStatus("Disabled");

    private String value;

    /**
     * Creates a custom value for PolicyStatus.
     * @param value the custom value
     */
    public PolicyStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PolicyStatus)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PolicyStatus rhs = (PolicyStatus) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
