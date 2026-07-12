package com.github.lucasdevrj.exercicios.sistemabancario;

import java.math.BigDecimal;

public class Deposito extends OperacaoBancaria {

    public Deposito(BigDecimal valor) {
        super(valor);
    }

    @Override
    public void executar() {
        String deposito = String.format("Depósito de R$%.2f realizado", getValor());
        System.out.println(deposito);
    }
}
