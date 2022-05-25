package com.javaoopexercises.VideoVisualizer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {

    protected String name;
    protected Integer age;
    protected PersonSex sex;
    protected Float experience;

    public Person(String name, Integer age, PersonSex sex, Float experience) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.experience = 0F;
    }

    protected void earnExp() {
        this.experience++;
    }

}
