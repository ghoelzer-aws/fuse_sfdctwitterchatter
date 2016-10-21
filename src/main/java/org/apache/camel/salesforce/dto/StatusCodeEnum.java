/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist StatusCode
 */
public enum StatusCodeEnum {

    // Draft
    DRAFT("Draft"),
    // InApproval
    INAPPROVAL("InApproval"),
    // Activated
    ACTIVATED("Activated"),
    // Terminated
    TERMINATED("Terminated"),
    // Expired
    EXPIRED("Expired");

    final String value;

    private StatusCodeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StatusCodeEnum fromValue(String value) {
        for (StatusCodeEnum e : StatusCodeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}