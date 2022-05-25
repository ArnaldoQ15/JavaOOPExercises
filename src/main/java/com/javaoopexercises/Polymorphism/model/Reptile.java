package com.javaoopexercises.Polymorphism.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reptile extends Animal {

    private String scaleColor;

    @Override
    public void move() {
        System.out.println("Crawling...");
    }

    @Override
    public void feed() {
        System.out.println("Eating vegestables...");
    }

    @Override
    public void emitSound() {
        System.out.println("Reptile sound...");
    }
}
