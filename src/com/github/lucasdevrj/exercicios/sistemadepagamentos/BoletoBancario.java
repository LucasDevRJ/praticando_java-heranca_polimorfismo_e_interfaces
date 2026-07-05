package com.github.lucasdevrj.exercicios.sistemadepagamentos;

import java.math.BigDecimal;

public class BoletoBancario extends Pagamento implements Taxa {

    public BoletoBancario(BigDecimal valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n", getValor(), aplicaTaxa());
    }

    @Override
    public BigDecimal aplicaTaxa() {
        BigDecimal taxa = new BigDecimal("1.00").divide(new BigDecimal("100"));
        taxa = taxa.multiply(getValor());
        return taxa;
    }
}
