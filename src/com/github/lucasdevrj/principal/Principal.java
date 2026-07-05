package com.github.lucasdevrj.principal;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Mario", 15000);
        ((Gerente) gerente).setBonus(1000);
        gerente.exibirInformacoes();
        gerente.reajustarSalario(2);
        ((Gerente) gerente).aprovarProjeto("Uso de IA nos códigos Java");

        Funcionario desenvolvedor = new Desenvolvedor("Carla", 12000, "Back-end Java");
        desenvolvedor.reajustarSalario();
        desenvolvedor.exibirInformacoes();
    }
}
