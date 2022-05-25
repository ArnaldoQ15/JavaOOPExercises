package com.javaoopexercises.VideoVisualizer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Visualization {

    private Grasshopper watcher;
    private Video movie;

    public Visualization(Grasshopper watcher, Video movie) {
        this.watcher = watcher;
        this.movie = movie;
        this.watcher.setTotalAssisted(this.watcher.getTotalAssisted() + 1);
        this.movie.setViews(this.movie.getViews() + 1);
    }

    public String details() {
        return "Visualization{" +
                "watcher = " + watcher +
                ", movie = " + movie +
                '}';
    }

    public void rateVideo() {
        this.movie.setRate(5F);
    }

    public void rateVideo(Float note) {
        this.movie.setRate(note);
    }

    public void rateVideo(Integer percent) {
        Float total = 0F;

        if (percent <= 20) {
            total = 3F;
        } else if (percent <= 50) {
            total = 5F;
        } else if (percent <= 90) {
            total = 8F;
        } else {
            total = 10F;
        }
        this.movie.setRate(total);
    }

}
