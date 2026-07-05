package com.github.lucasdevrj.exercicios.sistemadenotificacao;

public class Email extends Notificacao {

    private String assunto;
    private String corpo;

    public Email(String destinatario, String assunto, String corpo) {
        super(destinatario);
        this.assunto = assunto;
        this.corpo = corpo;
    }

    @Override
    public void enviar() {
        String email = String.format(
                "Enviando Email para: %s\nAssunto: %s\nCorpo: %s\n",
                getDestinatario(),
                assunto,
                corpo
        );
        System.out.println(email);
    }
}
