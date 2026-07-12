/**
 * Imagine que você está desenvolvendo um sistema de gerenciamento para um sistema de entretenimento
 * que oferece diversos serviços, desde restaurantes até áreas de lazer. O sistema precisa lidar
 * com diferentes tipos de reservas, atendendo desde clientes casuais até os que possuem benefícios exclusivos.
 *
 * Crie um programa que:
 *
 * Tenha uma classe Reserva com três versões sobrecarregadas do método reservar():
 * Uma sem parâmetros, que imprime: "Reserva realizada"
 * Uma com data como parâmetro, que imprime: "Reserva feita para o dia [data]"
 * Uma com data e quantidade de pessoas, que imprime: "Reserva feita para o dia [data] para [X] pessoas"
 * Tenha uma subclasse ReservaVip, que herda de Reserva e sobrescreve o método reservar() sem parâmetros,
 * imprimindo uma mensagem exclusiva: "Reserva VIP confirmada com atendimento exclusivo"
 * Exemplo de entrada:
 *
 *
 * Reserva r = new Reserva();
 * r.reservar();
 * r.reservar("10/04");
 * r.reservar("12/04", 4);
 *
 * Reserva vip = new ReservaVip();
 * vip.reservar();
 *
 * Saída esperada:
 *
 * Reserva realizada
 * Reserva feita para o dia 10/04
 * Reserva feita para o dia 12/04 para 4 pessoas
 * Reserva VIP confirmada com atendimento exclusivo
 */

package com.github.lucasdevrj.exercicios.controledereservas;

import java.time.MonthDay;

public class Principal {
    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        reserva.reservar();
        reserva.reservar(MonthDay.of(8, 10));
        reserva.reservar(MonthDay.of(3, 17), 3);

        ReservaVip reservaVip = new ReservaVip();
        reservaVip.reservar();
    }
}
