# Praticando Java: Herança, Polimorfismo e Interfaces

## 📖 Descrição

Projeto composto por uma coleção de exercícios desenvolvidos em Java com foco na prática dos principais conceitos da Programação Orientada a Objetos (POO).

Cada pacote representa um cenário diferente, explorando a utilização de herança, polimorfismo, classes abstratas, interfaces, enums e sobrecarga de métodos por meio de exemplos independentes.

O objetivo é consolidar conceitos fundamentais da linguagem Java através de implementações simples e organizadas.

---

# 🎯 Objetivo

Praticar recursos da Programação Orientada a Objetos utilizando Java, aplicando conceitos como:

* Herança
* Polimorfismo
* Classes abstratas
* Interfaces
* Sobrescrita de métodos (Override)
* Sobrecarga de métodos (Overload)
* Encapsulamento
* Enumerações (Enum)
* Organização em pacotes

---

# 🚀 Funcionalidades

O projeto reúne diversos exercícios independentes, incluindo:

* Sistema de funcionários
* Sistema de pagamentos
* Sistema bancário
* Sistema de notificações
* Controle de dispositivos
* Controle de reservas
* Gerenciamento de biblioteca
* Sistema escolar
* Identificação de estudantes
* Implementação de interfaces para impressão
* Envio de mensagens

Cada exercício possui sua própria classe `Principal`, permitindo execução individual.

---

# 🛠 Tecnologias utilizadas

| Tecnologia                      | Utilização                          |
| ------------------------------- | ----------------------------------- |
| Java                            | Linguagem principal                 |
| Programação Orientada a Objetos | Modelagem das soluções              |
| IntelliJ IDEA                   | Estrutura do projeto (.idea e .iml) |

O projeto não utiliza bibliotecas externas nem frameworks.

---

# 📂 Estrutura do projeto

```text
src/
└── com/
    └── github/
        └── lucasdevrj/
            ├── principal/
            │   ├── Funcionario.java
            │   ├── Gerente.java
            │   ├── Desenvolvedor.java
            │   ├── Aprovador.java
            │   └── Principal.java
            │
            └── exercicios/
                ├── controlededispositivos/
                ├── controledereservas/
                ├── enviandomensagens/
                ├── gerenciamentodebiblioteca/
                ├── identificandooestudante/
                ├── implementandoumainterface/
                ├── sistemabancario/
                ├── sistemadenotificacao/
                ├── sistemadepagamentos/
                └── sistemaescolar/
```

Cada diretório representa um exercício independente.

---

# ▶️ Como executar

Clone o repositório:

```bash
git clone <url-do-repositorio>
```

Abra o projeto em uma IDE compatível com Java, como IntelliJ IDEA, Eclipse ou VS Code.

Em seguida:

1. Navegue até o pacote desejado.
2. Abra a classe `Principal.java`.
3. Execute o método `main()`.

Como os exercícios são independentes, cada pacote possui sua própria classe de entrada.

---

# 💻 Exemplos de uso

## Sistema de Funcionários

Demonstra:

* Classe abstrata `Funcionario`
* Especializações `Gerente` e `Desenvolvedor`
* Reajuste salarial
* Polimorfismo
* Métodos abstratos
* Interface para aprovação de projetos

---

## Sistema de Pagamentos

Explora diferentes formas de pagamento utilizando:

* Classe abstrata `Pagamento`
* Implementações para:

  * Pix
  * Cartão de Crédito
  * Boleto Bancário
* Interface para aplicação de taxas

---

## Sistema Bancário

Apresenta:

* Operações bancárias
* Depósitos
* Saques
* Polimorfismo entre operações

---

## Sistema de Notificações

Simula diferentes canais de comunicação:

* Email
* SMS
* Push Notification

---

## Controle de Dispositivos

Implementa uma interface comum para dispositivos controláveis, como:

* Luz
* Ar-condicionado

---

## Gerenciamento de Biblioteca

Modela diferentes tipos de mídias, incluindo:

* Livro
* Ebook
* Revista

---

# 📚 Conceitos aplicados

Durante os exercícios são utilizados diversos conceitos importantes da orientação a objetos:

* Classes abstratas
* Interfaces
* Herança simples
* Polimorfismo
* Encapsulamento
* Sobrescrita de métodos
* Sobrecarga de métodos
* Uso de `BigDecimal`
* Uso de `enum`
* Organização em pacotes
* Reutilização de código

---

# 📖 Aprendizados

O projeto demonstra, na prática, como:

* reutilizar comportamento através de herança;
* especializar classes por meio de sobrescrita;
* trabalhar com abstrações utilizando classes abstratas;
* desacoplar comportamentos através de interfaces;
* aplicar polimorfismo para tratar diferentes objetos de forma uniforme;
* organizar projetos Java em pacotes temáticos.

---

# 💡 Melhorias futuras

As sugestões abaixo não fazem parte da implementação atual, mas podem enriquecer o projeto:

* Adicionar Maven ou Gradle para gerenciamento de dependências.
* Criar testes automatizados com JUnit.
* Adicionar documentação JavaDoc.
* Criar um menu único para executar todos os exercícios.
* Implementar tratamento de exceções.
* Adicionar integração contínua (GitHub Actions).
* Criar diagramas UML do relacionamento entre as classes.
* Separar melhor os exemplos em módulos ou projetos independentes.

---

# 👤 Autor

Lucas Dev RJ

---

# 📄 Licença

Nenhuma licença foi identificada no projeto.
Caso o repositório seja publicado como Open Source, recomenda-se adicionar uma licença, como a MIT License.
