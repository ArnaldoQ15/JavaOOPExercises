package com.javaoopexercises.HeritagePt2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentTechnical extends Student {

    private Integer profRegister;

    public void practice(){
        System.out.println("Practicing...");
    }

}
