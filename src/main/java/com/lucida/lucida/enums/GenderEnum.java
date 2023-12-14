package com.lucida.lucida.enums;

public enum GenderEnum {
    FEMALE("Kadın"),
    MALE("Erkek");

    private final String gender;
    GenderEnum(String gender) {
        this.gender = gender;
    }

    public String getValue() {
        return gender;
    }
}
