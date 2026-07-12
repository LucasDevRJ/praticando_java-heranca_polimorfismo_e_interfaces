package com.github.lucasdevrj.exercicios.controledereservas;

public class ReservaVip extends Reserva {

    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }

}
