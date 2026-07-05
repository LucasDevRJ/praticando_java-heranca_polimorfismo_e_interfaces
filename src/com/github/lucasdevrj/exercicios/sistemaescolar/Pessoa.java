package com.github.lucasdevrj.exercicios.sistemaescolar;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pessoa {

    private String nome;
    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        int idade = Period.between(dataDeNascimento, dataAtual).getYears();
        return idade;
    }

    public abstract void exibirDados();
}
