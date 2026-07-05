package com.github.lucasdevrj.exercicios.identificandooestudante;

public enum TipoDeAluno {
    REGULAR("Regular"),
    BOLSISTA("Bolsista");

    private final String tipo;

    TipoDeAluno(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
