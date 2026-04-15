package model;

public class Vinil {

    private String nome;
    private int quantidade;

    // construtor
    public Vinil(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // setter
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}