package com.javaoopexercises.HeritagePt2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person {

    private Integer registration;
    private String course;

    public void payMensal() {
        System.out.println("Paid.");
    }

}
