package edu.gabi.Sistema_Smart_Tv;

public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);

    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void avancarCanal(){
        canal++;
        System.out.println("Canal Atual: " + canal);
    }

    public void voltarCanal(){
        canal--;
        System.out.println("Canal Atual: " + canal);
    }
}
