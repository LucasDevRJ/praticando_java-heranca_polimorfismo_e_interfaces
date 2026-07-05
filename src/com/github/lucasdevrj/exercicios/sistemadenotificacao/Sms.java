package com.github.lucasdevrj.exercicios.sistemadenotificacao;

public class Sms extends Notificacao {

    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        String sms = String.format(
                "Enviando SMS para: %s\nMensagem: %s\n",
                getDestinatario(),
                getMensagem()
        );
        System.out.println(sms);
    }
}
