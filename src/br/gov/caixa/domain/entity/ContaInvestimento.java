package br.gov.caixa.domain.entity;

public class ContaInvestimento extends Conta implements Rendimento {
    public ContaInvestimento(String usuarioId) {
        super(usuarioId);
    }

    @Override
    public void calcularRendimento() {
        /* TO DO: Lógica para calcular o rendimento do saldo em conta na investimento
            Clientes PF possuem rendimentos de 1% ao mês
            Clientes PJ possuem rendimentos de 2% ao mês
            O rendimento é gerado no início de cada mês
        */
    }


}
