package com.github.lucasdevrj.exercicios.controlededispositivos;

public class Luz  implements Controlavel {

    private boolean ligado = false;

    @Override
    public void ligar() {
        if (!ligado) {
            System.out.println("Luz ligada.");
            ligado = true;
        } else {
            System.out.println("Luz já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            System.out.println("Luz desligada.");
            ligado = false;
        } else {
            System.out.println("Luz já estava desligada.");
        }
    }
}
