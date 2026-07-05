package com.github.lucasdevrj.exercicios.identificandooestudante;

public class Bolsista extends Aluno {

    public Bolsista(String nome) {
        super(nome);
        setTipoDeAluno(TipoDeAluno.BOLSISTA);
    }

}
