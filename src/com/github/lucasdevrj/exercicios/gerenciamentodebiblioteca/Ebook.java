package com.github.lucasdevrj.exercicios.gerenciamentodebiblioteca;

import java.time.Year;

public class Ebook extends Midia {

    private String formato;

    public Ebook(String titulo, Year anoDeLancamento, String formato) {
        super(titulo, anoDeLancamento);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Ebook: %s - Formato: %s\n", getCodigo(), getTitulo(), formato);
    }
}
