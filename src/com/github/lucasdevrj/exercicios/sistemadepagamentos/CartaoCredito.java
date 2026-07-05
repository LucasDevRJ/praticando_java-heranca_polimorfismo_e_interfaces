package com.github.lucasdevrj.exercicios.sistemadepagamentos;

import java.math.BigDecimal;

public class CartaoCredito extends Pagamento implements Taxa {

    public CartaoCredito(BigDecimal valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n", getValor(), aplicaTaxa());
    }

    @Override
    public BigDecimal aplicaTaxa() {
        BigDecimal taxa = new BigDecimal("3.00").divide(new BigDecimal("100"));
        taxa = taxa.multiply(getValor());
        return taxa;
    }
}
