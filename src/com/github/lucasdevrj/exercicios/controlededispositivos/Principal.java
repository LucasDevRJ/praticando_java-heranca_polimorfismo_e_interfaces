package com.github.lucasdevrj.exercicios.controlededispositivos;

public class Principal {
    public static void main(String[] args) {
        Luz luz = new Luz();
        luz.desligar();
        luz.ligar();
        luz.ligar();

        ArCondicionado arCondicionado = new ArCondicionado();
        arCondicionado.ligar();
        arCondicionado.ligar();
        arCondicionado.desligar();
        arCondicionado.desligar();
    }
}
