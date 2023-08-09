package br.com.fiap.domain.entity;

import java.math.BigDecimal;

public class Produto {
    private String id;
    private String nome;
    private String descricao;
    private BigDecimal valor;

    public Produto() {
    }

    public Produto(String id, String nome, String descricao, BigDecimal valor) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setValor(valor);
    }

    public String getId() {
        return id;
    }

    public Produto setId(String id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Produto setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + getId() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", valor=" + getValor() +
                '}';
    }
}
