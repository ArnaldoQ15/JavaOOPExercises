package com.javaoopexercises.Polymorphism.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fish extends Animal {

    private String scaleColor;

    @Override
    public void move() {
        System.out.println("Swimming...");
    }

    @Override
    public void feed() {
        System.out.println("Eating substances...");
    }

    @Override
    public void emitSound() {
        System.out.println("Fish don't emit sound...");
    }

    public void poppedBubbles() {
        System.out.println("Popped a bubble...");
    }
}
