/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Summary of the replication job data for this vault.
 */
public class JobsSummary {
    /**
     * Count of failed jobs.
     */
    @JsonProperty(value = "failedJobs")
    private Integer failedJobs;

    /**
     * Count of suspended jobs.
     */
    @JsonProperty(value = "suspendedJobs")
    private Integer suspendedJobs;

    /**
     * Count of in-progress jobs.
     */
    @JsonProperty(value = "inProgressJobs")
    private Integer inProgressJobs;

    /**
     * Get the failedJobs value.
     *
     * @return the failedJobs value
     */
    public Integer failedJobs() {
        return this.failedJobs;
    }

    /**
     * Set the failedJobs value.
     *
     * @param failedJobs the failedJobs value to set
     * @return the JobsSummary object itself.
     */
    public JobsSummary withFailedJobs(Integer failedJobs) {
        this.failedJobs = failedJobs;
        return this;
    }

    /**
     * Get the suspendedJobs value.
     *
     * @return the suspendedJobs value
     */
    public Integer suspendedJobs() {
        return this.suspendedJobs;
    }

    /**
     * Set the suspendedJobs value.
     *
     * @param suspendedJobs the suspendedJobs value to set
     * @return the JobsSummary object itself.
     */
    public JobsSummary withSuspendedJobs(Integer suspendedJobs) {
        this.suspendedJobs = suspendedJobs;
        return this;
    }

    /**
     * Get the inProgressJobs value.
     *
     * @return the inProgressJobs value
     */
    public Integer inProgressJobs() {
        return this.inProgressJobs;
    }

    /**
     * Set the inProgressJobs value.
     *
     * @param inProgressJobs the inProgressJobs value to set
     * @return the JobsSummary object itself.
     */
    public JobsSummary withInProgressJobs(Integer inProgressJobs) {
        this.inProgressJobs = inProgressJobs;
        return this;
    }

}
