
package com.mycompany.revisao.Exercicio4;

/**
 *
 * @author rafaelamoreira
 */
public class Namekian extends PersonagemDragonBall {

    private int quantidadeEsferas;
    private boolean podeCurar;

    public Namekian(String nome, int idade, char sexo, long ki, String poderEspecial, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, ki, poderEspecial);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    public int getQuantidadeEsferas() {
        return quantidadeEsferas;
    }

    public void setQuantidadeEsferas(int quantidadeEsferas) {
        this.quantidadeEsferas = quantidadeEsferas;
    }

    public boolean isPodeCurar() {
        return podeCurar;
    }

    public void setPodeCurar(boolean podeCurar) {
        this.podeCurar = podeCurar;
    }

    public String transformarPedido(String pedido) {
        String pedidoNamekusei = " ";
        for (int i = 0; i < pedido.length(); i++) {
            pedidoNamekusei += decodificar(pedido.charAt(i));
        }
        return pedidoNamekusei;
    }

    public char decodificar(char c) {
        char nc = c;
        switch (c) {
            case 'a' ->
                nc = 'x';
            case 'e' ->
                nc = 'y';
            case 'i' ->
                nc = 'z';
            case 'o' ->
                nc = 'w';
            case 'u' ->
                nc = 'k';
        }
        return nc;
    }

}
