package br.gov.caixa.domain.entity;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
    private BigDecimal taxa = new BigDecimal("1"); // Valor padrao da taxa para 1
    public ContaCorrente(String usuarioId) {
        super(usuarioId);
        //Verificar se é CPF ou CNPJ, se for CNPJ o valor da taxa será 0.005
        if(usuarioId.length() > 11){
            taxa = new BigDecimal("0.005");
        }
    }
    @Override
    public void sacar(BigDecimal valor) {
        BigDecimal valorComTaxa = valor.add(valor.multiply(taxa));
        if (super.consultarSaldo().compareTo(valorComTaxa) >= 0) {
            super.depositar(valorComTaxa.negate());
        }
    }
    public final void investir(BigDecimal valor){
        //TO DO - Verificar se a conta de investimento já foi criada, caso negativo criá-la
        if (super.consultarSaldo().compareTo(valor) >= 0) {
            //TO DO Investir valor
            //TO DO - INCLUIR ACAO NA LISTA DE REGISTROS
        }
    }
}
