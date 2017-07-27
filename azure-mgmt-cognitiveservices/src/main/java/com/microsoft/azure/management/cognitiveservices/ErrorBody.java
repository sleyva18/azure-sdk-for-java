/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cognitive Services error body.
 */
public class ErrorBody {
    /**
     * error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ErrorBody object itself.
     */
    public ErrorBody withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the ErrorBody object itself.
     */
    public ErrorBody withMessage(String message) {
        this.message = message;
        return this;
    }

}
