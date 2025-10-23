package br.fastfood.model;

public class Sobremesa implements ItemCombo {
    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s (R$ %.2f)", nome, preco);
    }
}
