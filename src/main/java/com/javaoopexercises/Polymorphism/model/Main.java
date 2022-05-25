package com.javaoopexercises.Polymorphism.model;

public class Main {

    public static void main(String[] args) {

        Mammal m = new Mammal();
        Reptile r = new Reptile();
        Fish f = new Fish();
        Bird b = new Bird();
        Carp c = new Carp();

        m.setWeight(50.6F);
        m.setAge(6);
        m.setMembers(4);
        m.setFellColor("Blue");
        m.move();
        m.feed();
        m.emitSound();

        r.feed();

        f.emitSound();
        f.move();
        f.feed();

        b.move();

        c.move();

    }

}
