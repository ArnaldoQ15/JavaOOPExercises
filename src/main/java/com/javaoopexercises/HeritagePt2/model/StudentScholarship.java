package com.javaoopexercises.HeritagePt2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentScholarship extends Student {

    private Integer benefit;

    public void renewBenefit() {
        System.out.println("Renewing...");
    }

    @Override
    public void payMensal() {
        System.out.println(this.getName() + " is scholarship. Payment facilited.");
    }

}
