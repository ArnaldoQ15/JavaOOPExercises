package com.javaoopexercises.Polymorphism.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mammal extends Animal {

    private String fellColor;

    @Override
    public void move() {
        System.out.println("Walking...");
    }

    @Override
    public void feed() {
        System.out.println("Mamming...");
    }

    @Override
    public void emitSound() {
        System.out.println("Mammal sound...");
    }
}
