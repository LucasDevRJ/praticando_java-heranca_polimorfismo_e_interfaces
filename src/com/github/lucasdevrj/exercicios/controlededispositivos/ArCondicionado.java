package com.github.lucasdevrj.exercicios.controlededispositivos;

public class ArCondicionado implements Controlavel {

    private boolean ligado = false;

    @Override
    public void ligar() {
        if (!ligado) {
            System.out.println("Ar-condicionado ligado.");
            ligado = true;
        } else {
            System.out.println("Ar-condicionado já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            System.out.println("Ar-condicionado desligado.");
            ligado = false;
        } else {
            System.out.println("Ar-condicionado já estava desligado.");
        }
    }
}
