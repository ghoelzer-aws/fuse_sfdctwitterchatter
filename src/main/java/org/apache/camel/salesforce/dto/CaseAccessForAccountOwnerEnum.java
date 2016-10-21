/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CaseAccessForAccountOwner
 */
public enum CaseAccessForAccountOwnerEnum {

    // None
    NONE("None"),
    // Read
    READ("Read"),
    // Edit
    EDIT("Edit");

    final String value;

    private CaseAccessForAccountOwnerEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CaseAccessForAccountOwnerEnum fromValue(String value) {
        for (CaseAccessForAccountOwnerEnum e : CaseAccessForAccountOwnerEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}