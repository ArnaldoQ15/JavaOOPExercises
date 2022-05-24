package com.javaoopexercises.Heritage.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends Person {

    private String especiality;
    private Float salary;

    public void moreSalary(Float more) {
        this.salary += more;
    }

}
