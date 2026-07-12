package com.github.lucasdevrj.exercicios.implementandoumainterface;

public class Relatorio implements Imprimivel {

    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        String relatorio = """
                Título: %s
                Conteúdo: %s
                """.formatted(titulo, conteudo);
        System.out.println(relatorio);
    }
}
