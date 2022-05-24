package com.javaoopexercises.Heritage.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String name;
    private Integer age;
    private PersonSex sex;

    public final void haveBirthday() {
        this.age++;
    }

    public String details() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        Student p2 = new Student();
        Teacher p3 = new Teacher();
        Funcionary p4 = new Funcionary();

        p1.setName("Arnaldo");
        p2.setName("Maria");
        p3.setName("Cláudio");
        p4.setName("Fabiana");

        p1.setSex(PersonSex.MALE);
        p2.setSex(PersonSex.FEMALE);
        p3.setSex(PersonSex.MALE);
        p4.setSex(PersonSex.FEMALE);

        p1.setAge(22);
        p2.setAge(24);
        p3.setAge(26);
        p4.setAge(28);

        System.out.println(p1.details());
        System.out.println(p2.details());
        System.out.println(p3.details());
        System.out.println(p4.details());

    }


}
