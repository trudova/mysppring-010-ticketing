package com.liv.enums;

public enum Gender {
    FEMALE("female"),MALE("male");
    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
