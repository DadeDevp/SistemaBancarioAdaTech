package br.gov.caixa.domain.entity;

public class ContaPoupanca extends Conta implements Rendimento{

    //TO DO - Restringir para USUARIO do TipoPessoa = PF
    public ContaPoupanca(String usuarioId) {
        super(usuarioId);
    }

    @Override
    public void calcularRendimento() {
        //TO DO - Lógica para calcular o rendimento do saldo em conta na poupança
    }
}
