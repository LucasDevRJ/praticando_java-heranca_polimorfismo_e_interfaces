package com.github.lucasdevrj.exercicios.gerenciamentodebiblioteca;

import java.time.Year;

public class Livro extends Midia {

    private String autor;

    public Livro(String titulo, Year anoDeLancamento, String autor) {
        super(titulo, anoDeLancamento);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Livro: %s - Autor: %s\n", getCodigo(), getTitulo(), autor);
    }
}
