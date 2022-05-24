package com.javaoopexercises.Heritage.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person {

    private Integer matters;
    private String course;

    public void cancelMatter() {
        System.out.println("Your matricule will be removed.");
    }

}
