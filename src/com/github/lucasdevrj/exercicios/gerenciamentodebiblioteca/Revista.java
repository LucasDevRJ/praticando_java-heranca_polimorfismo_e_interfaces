package com.github.lucasdevrj.exercicios.gerenciamentodebiblioteca;

import java.time.Year;

public class Revista extends Midia {

    private int edicao;

    public Revista(String titulo, Year anoDeLancamento, int edicao) {
        super(titulo, anoDeLancamento);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Revista: %s - Edição: %d\n", getCodigo(), getTitulo(), edicao);
    }

}
