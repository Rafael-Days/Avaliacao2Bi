package org.example;

public class Produto {
    private String nome;
    private Float preco;
    private Produto proximo;
    private Produto anterior;

    public Produto(String nome, Float preco) {
        this.nome = nome;
        this.preco = preco;
        this.proximo = null;
        this.anterior = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Produto getProximo() {
        return proximo;
    }

    public void setProximo(Produto proximo) {
        this.proximo = proximo;
    }

    public Produto getAnterior() {
        return anterior;
    }

    public void setAnterior(Produto anterior) {
        this.anterior = anterior;
    }
}
