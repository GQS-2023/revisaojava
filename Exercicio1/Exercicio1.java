/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao.Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Exercicio1 {

    public static void main(String[] args) {

        /*
        Faça um programa que leia um número indeterminado de valores, 
        correspondentes a notas, encerrando a entrada de dados 
        quando for informado um valor igual a -1 (que não deve ser 
        armazenado). Após esta entrada de dados, faça:
        a) Mostre a quantidade de valores que foram lidos;
        b) Exiba todos os valores na ordem em que foram informados, 
        um ao lado do outro;
        c) Calcule e mostre a soma dos valores;
        d) Calcule e mostre a média dos valores;
        e) Calcule e mostre a quantidade de valores acima da média calculada;
        f) Encerre o programa com uma mensagem;
         */
        Scanner sc = new Scanner(System.in);
        double nota;
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {

            System.out.println("Informe uma nota (-1 para sair): ");
            nota = sc.nextDouble();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
        }
        int qtdNotas = notas.size();
        System.out.println("Quantidade de notas:" + qtdNotas);

        if (qtdNotas > 0) {
            System.out.println(notas.toString());
            double soma = soma(notas);
            System.out.println("Soma: " + soma);
            double media = soma / qtdNotas;
            System.out.println("Media:" + media);
            int acimaMedia = calculaAcimaMedia(notas, media);
            System.out.println("Quantidade acima da média: " + acimaMedia);
            System.out.println("Programa de notas de alunos!");
        } else {
            System.out.println("Nenhuma nota cadastrada...");
        }
    }

    public static double soma(ArrayList<Double> notas) {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma;
    }

    public static int calculaAcimaMedia(ArrayList<Double> notas, double media) {
        int cont = 0;
        for (Double nota : notas) {
            if (nota > media) {
                cont++;
            }
        }
        return cont;
    }
}
