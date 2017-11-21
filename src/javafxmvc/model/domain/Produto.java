package javafxmvc.model.domain;

import java.io.Serializable;

/**
 *
 * @author mateus_de-oliveira
 */
public class Produto implements Serializable{
 private int cdProduto;
 private String nome;
 private double preco;
 private int quantidade;
 private Categoria categoria;

    public Produto(int cdProduto, String nome, double preco, int quantidade, Categoria categoria) {
        this.cdProduto = cdProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Produto() {
    }

    public int getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(int cdProduto) {
        this.cdProduto = cdProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
 
 
}
