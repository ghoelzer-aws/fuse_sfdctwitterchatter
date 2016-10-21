/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Jul 02 00:28:59 CDT 2015
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist MarketingSegmentationCluster
 */
public enum MarketingSegmentationClusterEnum {

    // 1
    _1("1"),
    // 2
    _2("2"),
    // 3
    _3("3"),
    // 4
    _4("4"),
    // 5
    _5("5"),
    // 6
    _6("6"),
    // 7
    _7("7"),
    // 8
    _8("8"),
    // 9
    _9("9"),
    // 10
    _10("10"),
    // 11
    _11("11"),
    // 12
    _12("12"),
    // 13
    _13("13"),
    // 14
    _14("14"),
    // 15
    _15("15"),
    // 16
    _16("16"),
    // 17
    _17("17"),
    // 18
    _18("18"),
    // 19
    _19("19"),
    // 20
    _20("20"),
    // 21
    _21("21"),
    // 22
    _22("22");

    final String value;

    private MarketingSegmentationClusterEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MarketingSegmentationClusterEnum fromValue(String value) {
        for (MarketingSegmentationClusterEnum e : MarketingSegmentationClusterEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}