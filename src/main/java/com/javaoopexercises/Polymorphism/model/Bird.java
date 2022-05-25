package com.javaoopexercises.Polymorphism.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bird extends Animal {

    private String fellColor;

    @Override
    public void move() {
        System.out.println("Flying...");
    }

    @Override
    public void feed() {
        System.out.println("Eating seeds...");
    }

    @Override
    public void emitSound() {
        System.out.println("Bird sound...");
    }

    public void makeNest() {
        System.out.println("Building a nest...");
    }

}
