package br.gov.caixa.domain.entity;

import br.gov.caixa.domain.enums.Acao;

import java.math.BigDecimal;
import java.util.Date;

public class Registro {
    private Date data;
    private Acao tipo;
    private BigDecimal valorPretendido;
    private BigDecimal valorReal;
    private Usuario usuarioOrigem;
    private Usuario usuarioDestino;
    private String observacao;

    public Registro(){}

    public Registro(Date data, Acao tipo, BigDecimal valorPretendido, BigDecimal valorReal, Usuario usuarioOrigem, Usuario usuarioDetino, String observacao) {
        this.data = data;
        this.tipo = tipo;
        this.valorPretendido = valorPretendido;
        this.valorReal = valorReal;
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDetino;
        this.observacao = observacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Acao getTipo() {
        return tipo;
    }

    public void setTipo(Acao tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValorPretendido() {
        return valorPretendido;
    }

    public void setValorPretendido(BigDecimal valorPretendido) {
        this.valorPretendido = valorPretendido;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }

    public Usuario getUsuarioOrigem() {
        return usuarioOrigem;
    }

    public void setUsuarioOrigem(Usuario usuarioOrigem) {
        this.usuarioOrigem = usuarioOrigem;
    }

    public Usuario getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(Usuario usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
