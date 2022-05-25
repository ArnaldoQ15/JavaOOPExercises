package com.javaoopexercises.Polymorphism.model;

public class Main {

    public static void main(String[] args) {

        Mammal m = new Mammal();
        Reptile r = new Reptile();
        Fish f = new Fish();
        Bird b = new Bird();
        Carp c = new Carp();
        LittleCarp lt = new LittleCarp();

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

        lt.setWeight(59.9F);
        lt.setAge(6);
        lt.move(lt.getAge(), lt.getWeight());
        lt.move(lt.getAge());

    }

}
