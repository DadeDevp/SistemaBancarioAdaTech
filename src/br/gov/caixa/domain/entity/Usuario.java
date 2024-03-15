package br.gov.caixa.domain.entity;

import br.gov.caixa.domain.enums.Status;
import br.gov.caixa.domain.enums.TipoPessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String id; //String para CPF e CNPJ
    private String classificacao;
    private String nome;
    private LocalDate dataCadastro = LocalDate.now();
    private Status status;
    private TipoPessoa tipoPessoa;

    //Verificar se será útil a criacao de uma lista de contas vinculadas ao usuario
    //private List<Conta> contas = new ArrayList<>;

    public Usuario(String id, String classificacao, String nome, Status status,TipoPessoa tipoPessoa) {
        this.id = id;
        validaCpfCnpj(id,tipoPessoa);
        this.classificacao = classificacao;
        this.nome = nome;
        this.status = status;
        this.tipoPessoa = tipoPessoa;
        new ContaCorrente(this.id); //Cria uma conta corrente para o novo usuario
    }

    private void validaCpfCnpj(String id, TipoPessoa tipoPessoa) {
        //TO DO Ver a possiblidade de lançar uma excecao caso o CPNJ / CPF nao seja validado
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
