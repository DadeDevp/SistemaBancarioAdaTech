package br.gov.caixa.domain.entity;

import br.gov.caixa.domain.enums.Status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public abstract class Conta {

    //Considerar mudar os modificadores para protected no futuro, para facilitar o acesso das classes filhas
    private Long id;
    private BigDecimal saldo; // BigDecimal recomendado para trabalhar com dinheiro
    private Status status;
    private Date dataAtualizacao;
    private ArrayList<Registro> historicoAcoes = new ArrayList<>();
    private String usuarioId;
    
    public Conta(String usuarioId) {
        this.usuarioId = usuarioId;
        this.status = Status.ATIVA;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public ArrayList<Registro> getHistoricoAcoes() {
        return historicoAcoes;
    }

    public void setHistoricoAcoes(ArrayList<Registro> historicoAcoes) {
        this.historicoAcoes = historicoAcoes;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public BigDecimal consultarSaldo() {
        return saldo;
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        //TO DO - INCLUIR ACAO NA LISTA DE REGITROS
    }
    public void sacar(BigDecimal valor) {
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.add(valor);
        }
        //TO DO - INCLUIR ACAO NA LISTA DE REGISTROS
    }
    public void transferir(BigDecimal valor, Long usuarioId){

        //TO DO:
        //A existência do usuário destino, por meio de seu identificador (CPF / CNPJ);
        //Provavelmente essa tarefa nao será de responsibilidade desta classe


        //Se o valor da transferência não é superior ao saldo corrente
        if (saldo.compareTo(valor) >= 0) {
            saldo = saldo.subtract(valor);
            //implementar a transferencia para o usuario de destino
        }

        //TO DO - INCLUIR ACAO NA LISTA DE REGISTROS

    }

    private void incluirRegistro(){
        //TO DO: Esse metodo deve receber um registro pronto como parametro OU
        // receber os atributos do registro como parametro e o novo registro ser instanciado no metodo
        Registro novoRegistro = new Registro(/*atributos*/);
        historicoAcoes.add(novoRegistro);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta that = (Conta) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
