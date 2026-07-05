package com.github.lucasdevrj.principal;

public class Gerente extends Funcionario {

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
}
