package com.github.lucasdevrj.exercicios.sistemabancario;

import java.math.BigDecimal;

public class Saque extends OperacaoBancaria {

    public Saque(BigDecimal valor) {
        super(valor);
    }

    @Override
    public void executar() {
        String saque = String.format("Saque de R$%.2f realizado", getValor());
        System.out.println(saque);
    }
}
