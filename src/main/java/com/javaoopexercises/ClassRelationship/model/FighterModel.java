package com.javaoopexercises.ClassRelationship.model;

import com.javaoopexercises.ClassRelationship.controller.FightsController;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class FighterModel implements FightsController {

    private String name;
    private String nationality;
    private Integer age;
    private Float height;
    private Float weight;
    private String category;
    private Integer wins;
    private Integer losses;
    private Integer draws;

    public FighterModel(String name, String nationality, Integer age, Float height, Float weight, Integer wins, Integer losses, Integer draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.setWins(wins);
        this.setLosses(losses);
        this.setDraws(draws);
    }

    public void setWeight(Float weight) {
        this.weight = weight;
        this.setCategory();
    }

    private void setCategory() {
        if (this.weight < 52.2F)
            this.category = "Invalid";
        else if (this.weight <= 70.3F) {
            this.category = "Soft";
        } else if (this.weight <= 83.9F) {
            this.category = "Medium";
        } else if (this.weight <= 120.2F) {
            this.category = "Hard";
        } else
            this.category = "Invalid";
    }

    @Override
    public void introduce() {
        System.out.println(this.getName() + ", " + this.getAge() + ", born in " + this.getNationality() + ", weighs " +
                this.getWeight() + "kg and your heighs is " + this.getHeight() + "m want a fight on category " +
                this.getCategory() + ".");
    }

    @Override
    public void status() {
        System.out.println(this.getName() + ", " + this.getAge() + ", have " + this.getWins() + " wins, " +
                this.getDraws() + " draws and " + this.getLosses() + " losses.");
    }

    @Override
    public void winFight() {
        this.setWins(getWins() + 1);
    }

    @Override
    public void lossFight() {
        this.setLosses(getLosses() + 1);
    }

    @Override
    public void drawFight() {
        this.setDraws(getDraws() + 1);
    }

    public static void main(String[] args) {

        FighterModel fighter[] = new FighterModel[6];

        fighter[0] = new FighterModel("Pretty Boy", "France", 31, 1.75F, 68.9F, 11, 2, 1);
        fighter[1] = new FighterModel("Putscript", "Brazil", 29, 1.68F, 57.8F, 14, 2, 3);
        fighter[2] = new FighterModel("Snapshadow", "USA", 35, 1.65F, 80.9F, 12, 2, 1);
        fighter[3] = new FighterModel("Dead Code", "Australia", 28, 1.93F, 81.6F, 13, 0, 2);
        fighter[4] = new FighterModel("UFOCobol", "Brazil", 37, 1.70F, 119.3F, 5, 4, 3);
        fighter[5] = new FighterModel("Nerdaart", "USA", 30, 1.81F, 105.7F, 12, 2, 4);

        Random random1 = new Random();
        int oneGuy = random1.nextInt(6);

        Random random2 = new Random();
        int otherGuy = random2.nextInt(6);

        Fight UEC01 = new Fight();
        UEC01.markFight(fighter[oneGuy], fighter[otherGuy]);
        UEC01.goFight(fighter[oneGuy], fighter[otherGuy]);

        fighter[oneGuy].status();
        fighter[otherGuy].status();

    }

}


