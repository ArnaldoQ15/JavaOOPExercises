package com.javaoopexercises.VideoVisualizer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Grasshopper extends Person {

    private String login;
    private Integer totalAssisted;

    public Grasshopper(String name, Integer age, PersonSex sex, Float experience, String login, Integer totalAssisted) {

        super(name, age, sex, experience);
        this.login = login;
        this.totalAssisted = 0;

    }

    public void anotherOne() {
        this.totalAssisted++;
    }
}
