package com.github.lucasdevrj.exercicios.sistemaescolar;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private double nota;

    public Aluno(String nome, LocalDate dataDeNascimento, double nota) {
        super(nome, dataDeNascimento);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.2f\n", getNome(), getIdade(), nota);
    }
}
