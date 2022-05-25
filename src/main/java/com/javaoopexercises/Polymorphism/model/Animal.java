package com.javaoopexercises.Polymorphism.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {

    protected Float weight;
    protected Integer age;
    protected Integer members;

    public abstract void move();
    public abstract void feed();
    public abstract void emitSound();

}