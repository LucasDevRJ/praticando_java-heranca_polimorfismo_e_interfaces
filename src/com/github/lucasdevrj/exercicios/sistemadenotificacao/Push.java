package com.github.lucasdevrj.exercicios.sistemadenotificacao;

public class Push extends Notificacao {

    private String titulo;
    private String conteudo;

    public Push(String destinatario, String titulo, String conteudo) {
        super(destinatario);
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void enviar() {
        String push = String.format(
                "Enviando Push para: %s\nTítulo: %s\nConteúdo: %s\n",
                getDestinatario(),
                titulo,
                conteudo
        );
        System.out.println(push);
    }
}
