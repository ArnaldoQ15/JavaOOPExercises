package com.javaoopexercises.JavaEncapsulation.controller;

public interface RemoteController {

    public abstract void on();

    public abstract void off();

    public abstract void openMenu();

    public abstract void closeMenu();

    public abstract void moreVolume();

    public abstract void lessVolume();

    public abstract void onMute();

    public abstract void offMute();

    public abstract void playVideo();

    public abstract void pauseVideo();

}