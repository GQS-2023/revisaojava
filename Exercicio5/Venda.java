/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao.Exercicio5;

import java.util.Map;

/**
 *
 * @author rafaelamoreira
 */
public class Venda {

    private int codigo;
    private Cliente cliente;
    private Map<Produto,Double> produtosVenda;

    public Venda(int codigo, Cliente cliente, Map<Produto,Double> produtosVenda) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtosVenda = produtosVenda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Map<Produto, Double> getProdutosVenda() {
        return produtosVenda;
    }

    public void setProdutosVenda(Map<Produto, Double> produtosVenda) {
        this.produtosVenda = produtosVenda;
    }
    
    public double calculaValorVenda() {
        double v = 0;

        for (Map.Entry<Produto,Double> entry: produtosVenda.entrySet()) {
            Produto p = entry.getKey();
            double quantidade = entry.getValue();
            v += p.getValor() * quantidade;
        }

        return v;
    }
    
    public void mostrarProdutosdoCliente(){
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Produtos:");
        for (Map.Entry<Produto,Double> entry: produtosVenda.entrySet()) {
            Produto p = entry.getKey();
            double quantidade = entry.getValue();
            System.out.println(p.getNome() + " : " + quantidade);
        }
    }
}
