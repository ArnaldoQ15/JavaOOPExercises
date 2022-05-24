package com.javaoopexercises.ClassRelationship.model;

import jdk.swing.interop.SwingInterOpUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Random;

@Getter
@Setter
public class Fight {

    private FighterModel challenged;
    private FighterModel challenger;
    private Integer rounds;
    private Boolean approved;


    public void markFight(FighterModel f1, FighterModel f2) {
        if (Objects.equals(f1.getCategory(), f2.getCategory()) && f1 != f2) {
            this.setApproved(true);
            this.setChallenged(f1);
            this.setChallenger(f2);
        } else {
                this.setApproved(false);
                this.setChallenged(null);
                this.setChallenger(null);
                System.out.println("Fighters are not in the same category or similar. Try again.");
            }
    }

    public void goFight(FighterModel f1, FighterModel f2) {
        if (this.getApproved()) {
            System.out.println("### CHALLENGER ###################");
            this.getChallenger().status();
            System.out.println("################### CHALLENGED ###");
            this.getChallenged().status();

            Random checkFight = new Random();
            int winner = checkFight.nextInt(3);

            switch (winner) {
                case 0 -> {
                    this.challenged.drawFight();
                    this.challenger.drawFight();
                    System.out.println("============ RESULT OF THE BATTLE ============");
                    System.out.println("============        Draw!         ============");
                    System.out.println("==============================================");
                }
                case 1 -> {
                    this.challenged.winFight();
                    this.challenger.lossFight();
                    System.out.println("============ RESULT OF THE BATTLE ============");
                    System.out.println(f1.getName() + " win the fight!");
                    System.out.println("==============================================");
                }
                case 2 -> {
                    this.challenged.lossFight();
                    this.challenger.winFight();
                    System.out.println("============ RESULT OF THE BATTLE ============");
                    System.out.println(f2.getName() + " win the fight!");
                    System.out.println("==============================================");
                }
                default -> {
                    System.out.println("The fight can't be completed.");
                }
            }
        }
    }

}
