/**
 * Imagine que você está desenvolvendo um sistema para uma biblioteca que precisa catalogar
 * diferentes tipos de mídias: livros, revistas e e-books. Cada mídia possui informações
 * específicas, como título e ano de publicação, mas algumas têm características únicas,
 * como autor (livros), edição (revistas) ou formato (e-books). Seu programa deve ser
 * capaz de exibir esses dados para facilitar a consulta pelos bibliotecários.
 *
 * Crie um programa que:
 *
 * Defina uma classe Midia com os atributos título e ano de publicação.
 * Defina um método que gere um código no formato “LIB- + os três primeiros caracteres do
 * título + ano de publicação”, por exemplo:
 * Código: LIB-O H1937 | Livro: "O Hobbit" - Autor: J.R.R. Tolkien
 * Crie as classes Livro, Revista e Ebook, todas herdando de Midia, adicionando:
 * Livro: atributo autor.
 * Revista: atributo edição.
 * Ebook: atributo formato.
 * Cadastre uma mídia de cada tipo.
 * Exiba o código e os detalhes de cada mídia usando o método exibirInfo.
 * Exemplo de entrada:
 *
 *
 * livro.exibirInfo();
 * revista.exibirInfo();
 * ebook.exibirInfo();
 *
 * Saída esperada:
 *
 *
 * Código: LIB-O G1979 | Livro: "O Guia do Mochileiro das Galáxias" - Autor: Douglas Adams
 * Código: LIB-Nat2023 | Revista: "National Geographic" - Edição: 245
 * Código: LIB-Cle2008 | Ebook: "Clean Code" - Formato: PDF
 */

package com.github.lucasdevrj.exercicios.gerenciamentodebiblioteca;

import java.time.Year;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Ensaio sobre a Cegueira", Year.of(1995), "José Saramago");
        Revista revista = new Revista("Nintendo Power", Year.of(1998), 1);
        Ebook ebook = new Ebook("Java 8 Prático", Year.of(2014), "PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();
    }
}
