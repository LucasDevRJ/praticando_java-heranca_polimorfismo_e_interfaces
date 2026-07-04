package com.github.lucasdevrj.principal;

public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Mario", 15000);
        gerente.exibirInformacoes();
        gerente.reajustarSalario(2);
        gerente.setBonus(1000);
    }
}
