package com.javaoopexercises.Polymorphism.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LittleCarp extends Carp {

    public void move(Integer age, Float weight) {
        if ((this.age >= 5) && (this.weight >= 60F)) {
            System.out.println("Going up the waterfall...");
            this.emitSound();
        } else {
            System.out.println("Can't move. You're not the choosed.");
            this.emitSound();
        }
    }

    public void move(Integer age) {
        if (this.age < 5) {
            System.out.println("You're too young, little carp.");
            this.emitSound();
        } else {
            System.out.println("You're too old, little carp.");
            this.emitSound();
        }
    }

}
