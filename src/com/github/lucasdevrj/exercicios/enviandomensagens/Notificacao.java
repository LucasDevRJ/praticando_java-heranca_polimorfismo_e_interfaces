package com.github.lucasdevrj.exercicios.enviandomensagens;

public class Notificacao {

    public void enviarMensagem(String mensagem) {
        String mensagemFormatada = String.format("Mensagem enviada para todos: %s", mensagem);
        System.out.println(mensagemFormatada);
    }

    public void enviarMensagem(String contato, String mensagem) {
        String mensagemFormatada = String.format("Mensagem para %s: %s", contato, mensagem);
        System.out.println(mensagemFormatada);
    }

    public void enviarMensagem(String contato, String mensagem, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            String mensagemFormatada = String.format("Mensagem para %s: %s", contato, mensagem);
            System.out.println(mensagemFormatada);
        }
    }

}
