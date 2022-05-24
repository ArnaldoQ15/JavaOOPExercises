package com.javaoopexercises.HeritagePt2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {

    private String name;
    private Integer age;
    private PersonSex sex;

    public final void haveBirthday() {
        this.age++;
    }

    public String personDetails() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
