package edu.gabi.Sistema_Smart_Tv;

public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligado);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada?: " + smartTv.ligado);
        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada?: " + smartTv.ligado);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(5);
        System.out.println("Canal Atual: " + smartTv.canal);


    }
}
