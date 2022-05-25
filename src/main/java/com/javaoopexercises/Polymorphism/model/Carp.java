package com.javaoopexercises.Polymorphism.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carp extends Fish {

    @Override
    public void move() {
        System.out.println("The carp that reached the top became a dragon. Because of this belief, it is believed " +
                "that a carp going upstream of a river means strength, courage and determination to achieve goals and " +
                "overcome difficulties. A carp descending means goals achieved or goals accomplished.");
    }

}
