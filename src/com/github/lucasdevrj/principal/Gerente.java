package com.github.lucasdevrj.principal;

public class Gerente extends Funcionario implements Aprovador {

    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s - Salário %.2f - bônus: %.2f", nome, salario, bonus);
    }

    @Override
    public void calcularPLR() {
        System.out.println("PLR do Gerente");
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("\nGerente %s aprovou o projeto %s", nome, nomeProjeto);
    }
}
