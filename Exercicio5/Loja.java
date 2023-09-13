/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao.Exercicio5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rafaelamoreira
 */
public class Loja {

    private List<Venda> vendas;

    public Loja() {
        this.vendas = new ArrayList<>();
    }

    public void realizarVenda(Venda v) {
        this.vendas.add(v);
    }

    public double calcularFaturamentoTotal() {
        double fat = 0;

        for (Venda v : vendas) {
            fat += v.calculaValorVenda();
        }
        return fat;
    }

    public static void iniciar() {
        Endereco ec1 = new Endereco(123, "Rua A", "Bairro B", "12345-678", "Cidade C", "Estado D");
        Cliente c1 = new Fisico(1, "João", "123-456-789", "joao@email.com", ec1, "123.456.789-01");

        Endereco ec2 = new Endereco(456, "Rua X", "Bairro Y", "98765-432", "Cidade Z","Estado W" );
        Cliente c2 = new Juridico(2, "Empresa XYZ", "987-654-321", "empresa@email.com",
                ec2, "12.345.678/0001-23", "Empresa XYZ Ltda");

        Produto p1 = new Produto(101, "Camiseta", 29.99, 100);
        Produto p2 = new Produto(102, "Calça", 49.99, 50);

        Map<Produto, Double> itensVenda1 = new HashMap<>();
        itensVenda1.put(p1, 2.0);
        p1.baixaNoEstoque(2.0);
        itensVenda1.put(p2, 1.0);
        p1.baixaNoEstoque(1.0);
        
        Venda venda1 = new Venda(1001, c1, itensVenda1);

        Map<Produto, Double> itensVenda2 = new HashMap<>();
        itensVenda2.put(p1, 5.0);
        p1.baixaNoEstoque(5.0);
        Venda venda2 = new Venda(1002, c2, itensVenda2);

        Loja loja = new Loja();
        loja.realizarVenda(venda1);
        System.out.println("-----------------");
        venda1.mostrarProdutosdoCliente();
        loja.realizarVenda(venda2);
        System.out.println("-----------------");
        venda2.mostrarProdutosdoCliente();
        
        System.out.printf("Faturamento da loja: R$ %.2f",loja.calcularFaturamentoTotal());

    }
}
