package com.github.lucasdevrj.exercicios.controledereservas;

import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class Reserva {

    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM");

    public void reservar() {
        System.out.println("Reserva realizada");
    }

    public void reservar(MonthDay data) {
        String dataFormatada = data.format(formato);
        String mensagem = String.format("Reserva feita para o dia %s", dataFormatada);
        System.out.println(mensagem);
    }

    public void reservar(MonthDay data, int quantidadePessoas) {
        String dataFormatada = data.format(formato);
        String mensagem = String.format("Reserva feita para o dia %s para %d pessoas", dataFormatada, quantidadePessoas);
        System.out.println(mensagem);
    }
}
