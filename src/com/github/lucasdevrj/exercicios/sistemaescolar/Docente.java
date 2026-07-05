package com.github.lucasdevrj.exercicios.sistemaescolar;

import java.time.LocalDate;

public class Docente extends Pessoa {

    private String disciplina;

    public Docente(String nome, LocalDate dataDeNascimento, String disciplina) {
        super(nome, dataDeNascimento);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Docente: %s - Idade: %d - Disciplina: %s\n", getNome(), getIdade(), disciplina);
    }
}
