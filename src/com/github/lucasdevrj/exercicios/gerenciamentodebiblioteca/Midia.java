package com.github.lucasdevrj.exercicios.gerenciamentodebiblioteca;

import java.time.Year;

public abstract class Midia {

    private String titulo;
    private Year anoDeLancamento;

    public Midia(String titulo, Year anoDeLancamento) {
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        String nomenclaturaPadrao = "LIB-";
        String tresPrimeirosCaracteresDoTitulo = titulo.substring(0, 3);
        return nomenclaturaPadrao.concat(tresPrimeirosCaracteresDoTitulo).concat(String.valueOf(anoDeLancamento));
    }

    public abstract void exibirInfo();
}
