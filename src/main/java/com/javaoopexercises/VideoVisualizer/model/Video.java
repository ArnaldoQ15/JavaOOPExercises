package com.javaoopexercises.VideoVisualizer.model;

import com.javaoopexercises.VideoVisualizer.service.VideoActionService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video implements VideoActionService {

    private String title;
    private Float rate;
    private Integer views;
    private Integer likes;
    private Integer unlikes;
    private Boolean playing;

    public Video(String title, Float rate, Integer views, Integer likes, Integer unlikes, Boolean playing) {
        this.title = title;
        this.rate = 0F;
        this.views = 1;
        this.likes = 0;
        this.unlikes = 0;
        this.playing = false;
    }

    @Override
    public void play() {
        this.playing = true;
        System.out.println("Video playing...");
    }

    @Override
    public void pause() {
        this.playing = false;
        System.out.println("Video paused.");
    }

    @Override
    public void like() {
        this.likes = this.likes + 1;
        System.out.println("Video liked.");
    }

    @Override
    public void unlike() {
        this.unlikes = this.unlikes + 1;
        System.out.println("Video unliked.");
    }

    public void setRate(Float rate) {
        float newer;
        newer = (this.rate + rate) / this.views;
        this.rate = newer;
    }

}
