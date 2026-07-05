/**
 * Você está desenvolvendo um sistema de gestão para uma escola, onde é necessário
 * organizar informações de alunos e docentes. Cada pessoa na escola possui dados
 * básicos, como nome e idade. No entanto, cada grupo também possui características
 * próprias: os alunos possuem uma nota final e os docentes são responsáveis por uma disciplina.
 *
 * Crie um programa que:
 *
 * Defina uma classe Pessoa com os atributos nome e idade.
 * Crie as classes Aluno e Docente, ambas herdando de Pessoa, adicionando:
 * Para Aluno: um atributo nota.
 * Para Docente: um atributo disciplina.
 * Instancie dois objetos Aluno e dois objetos Docente
 * Exiba as informações no terminal.
 * Exemplo de entrada:
 *
 *
 * aluno1.exibirDados();
 * aluno2.exibirDados();
 *
 * docente1.exibirDados();
 * docente2.exibirDados();
 *
 * Saída esperada:
 *
 * Aluno: Julia - Idade: 16 - Nota: 8.5
 * Aluno: Caio - Idade: 17 - Nota: 7.2
 * Docente: Marta - Idade: 40 - Disciplina: Matemática
 * Docente: Roberto - Idade: 38 - Disciplina: História
 */

package com.github.lucasdevrj.exercicios.sistemaescolar;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Mário", LocalDate.parse("1996-05-20"), 7.0);
        Aluno aluno2 = new Aluno("Lúcio", LocalDate.parse("1999-07-09"), 4.0);
        Docente docente = new Docente("Claúdio", LocalDate.parse("2002-02-12"), "Java");
        aluno2.exibirDados();
        aluno.exibirDados();
        docente.exibirDados();
    }
}
