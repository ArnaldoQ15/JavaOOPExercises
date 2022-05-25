package com.javaoopexercises.VideoVisualizer.model;

public class Main {

    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("One Piece ep. 1017", 9F, 50000, 4000, 10, true);

        Grasshopper g[] = new Grasshopper[3];

        g[0] = new Grasshopper("Arnaldo", 22, PersonSex.MALE, 23.4F, "ArnaldoQ15", 53);

        Visualization vis = new Visualization(g[0], v[0]);
        System.out.println(vis.details());

    }

}
