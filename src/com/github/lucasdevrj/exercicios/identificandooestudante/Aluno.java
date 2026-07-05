package com.github.lucasdevrj.exercicios.identificandooestudante;

public class Aluno {

    private String nome;
    private TipoDeAluno tipoDeAluno;
    private boolean alunoDoTipoJaDefinido = false;

    public Aluno(String nome, TipoDeAluno tipoDeAluno) {
        this.nome = nome;
        this.tipoDeAluno = tipoDeAluno;
        alunoDoTipoJaDefinido = true;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setTipoDeAluno(TipoDeAluno tipoDeAluno) {
        if (!alunoDoTipoJaDefinido) {
            this.tipoDeAluno = tipoDeAluno;
            alunoDoTipoJaDefinido = true;
        } else {
            System.out.println("O tipo do aluno já foi definido.");
        }
    }

    public void identificar() {
        System.out.printf("Aluno: %s - Tipo: %s\n", nome, tipoDeAluno);
    }
}
