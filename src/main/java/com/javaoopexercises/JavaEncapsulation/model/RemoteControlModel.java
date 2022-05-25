package com.javaoopexercises.JavaEncapsulation.model;

import com.javaoopexercises.JavaEncapsulation.service.RemoteService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemoteControlModel implements RemoteService {

    // Declaração de variáveis
    private Integer volume; // Volume da TV
    private Boolean status; // Status (ligado/desligado)
    private Boolean working; // Verifica se está tocando alguma mídia

    // Constructor da classe
    public RemoteControlModel(Integer volume, Boolean status, Boolean working) {
        this.volume = 50;
        this.status = false;
        this.working = false;
    }

    @Override
    public void on() { // Ligar
        this.setStatus(true);
    }

    @Override
    public void off() { // Desligar
        this.setStatus(false);
    }

    @Override
    public void openMenu() { // Abre o menu
        if (this.getStatus())
            this.setWorking(false);
        System.out.println("Volume: " + this.getVolume() + " ");
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("[]");
        }
    }

    @Override
    public void closeMenu() { // Fecha o menu
        if (this.getStatus() && !this.getWorking())
            this.setWorking(true);
        System.out.println("Fechando o menu...");
    }

    @Override
    public void moreVolume() { // Aumenta o volume
        if (this.getVolume() >= 0 && this.getVolume() < 100 && this.getStatus())
            setVolume(+1);
    }

    @Override
    public void lessVolume() { // Diminui o volume
        if (this.getVolume() > 0 && this.getVolume() <= 100 && this.getStatus())
            setVolume(-1);
    }

    @Override
    public void onMute() { // Ativa o mudo
        if (this.getVolume() > 0 && this.getStatus())
            this.setVolume(0);
    }

    @Override
    public void offMute() { // Desativa o mudo
        if (this.getVolume() == 0 && this.getStatus())
            this.setVolume(50);
    }

    @Override
    public void playVideo() { // Reproduz o vídeo
        if (this.getStatus() || !this.getWorking())
            this.setWorking(true);
    }

    @Override
    public void pauseVideo() { // Pausa o vídeo
        if (this.getStatus() && this.getWorking())
            this.setWorking(false);
    }
}