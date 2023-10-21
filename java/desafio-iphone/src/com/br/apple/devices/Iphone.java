package com.br.apple.devices;

import com.br.apple.app.Browser;
import com.br.apple.app.MusicPlayer;
import com.br.apple.app.Phone;

public class Iphone implements Phone, MusicPlayer, Browser {

    @Override
    public void goToPage() {
        System.out.println("Indo para a página...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void addNewPage() {
        System.out.println("Criando nova guia...");
    }

    @Override
    public void playMusic() {
        System.out.println("Reproduzindo...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausado.");
    }

    @Override
    public void nextMusic() {
        System.out.println("Próxima música.");
    }

    @Override
    public void previousMusic() {
        System.out.println("Música anterior.");
    }

    @Override
    public void call() {
        System.out.println("Ligando...");
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void refuseCall() {
        System.out.println("Ligação ignorada.");
    }

    @Override
    public void refuseCallWithText() {
        System.out.println("Recusando ligação com mensagem de texto.");
    }
}
