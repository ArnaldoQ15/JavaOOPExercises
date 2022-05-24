package com.javaoopexercises.HeritagePt2.model;

import lombok.Getter;

@Getter
public enum PersonSex {

    MALE("male"),
    FEMALE("female");

    private final String description;

    PersonSex(String description) {
        this.description = description;
    }
}
