/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EntityType.
 */
public enum EntityType {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Profile. */
    PROFILE("Profile"),

    /** Enum value Interaction. */
    INTERACTION("Interaction"),

    /** Enum value Relationship. */
    RELATIONSHIP("Relationship");

    /** The actual serialized value for a EntityType instance. */
    private String value;

    EntityType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EntityType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EntityType object, or null if unable to parse.
     */
    @JsonCreator
    public static EntityType fromString(String value) {
        EntityType[] items = EntityType.values();
        for (EntityType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
