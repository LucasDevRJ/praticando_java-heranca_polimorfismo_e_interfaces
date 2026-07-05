/**
 * Você está desenvolvendo um sistema de comunicação para uma plataforma que precisa enviar
 * alertas aos usuários de diferentes formas. Cada tipo de notificação tem suas
 * particularidades: um e-mail exige um assunto e um corpo, um SMS somente o texto
 * da mensagem, e uma notificação push deve conter um título e uma mensagem de texto.
 *
 * Crie um programa que:
 *
 * Defina uma classe base Notificacao com atributos destinatário e mensagem.
 * Crie classes específicas (Email, SMS, Push) que herdem de Notificacao.
 * Cada uma deve implementar o seu próprio método enviar(), exibindo como cada notificação
 * é disparada. Lembre-se de sobrescrever o método utilizando a anotação @override.
 * Exemplo de entrada:
 *
 * email.enviar();
 * sms.enviar();
 * push.enviar();
 *
 * Saída esperada:
 *
 * Enviando Email para: cliente@exemplo.com
 * Assunto: Promoção especial!
 * Corpo: Aproveite nossos descontos esta semana.
 *
 * Enviando SMS para: (11) 98765-4321
 * Mensagem: Sua fatura foi paga com sucesso.
 *
 * Enviando Push para: usuario_app
 * Título: Novidade!
 * Conteúdo: Você tem uma nova mensagem não lida.
 */

package com.github.lucasdevrj.exercicios.sistemadenotificacao;

public class Principal {
    public static void main(String[] args) {
        Sms sms = new Sms("(21) 96917-2735", "Compra confirmada.");
        Email email = new Email("aluno@dominio.com", "Curso de Java", "Oi amigo, te recomendo o Curso de Java da Alura.");
        Push push = new Push("aluno_alura", "Atenção!", "Fatura esta fechada.");

        sms.enviar();
        email.enviar();
        push.enviar();
    }
}
