package com.javaoopexercises.BookPublication.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String name;
    private Integer age;
    private PersonSex sex;

    public void haveBirthday(){
        this.age = this.age + 1;
    }

    public Person(String name, Integer age, PersonSex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
