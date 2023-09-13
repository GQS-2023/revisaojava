/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao.Exercicio2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rafaelamoreira
 */
public class Exercicio2 {
    /**
     * Faça um programa que simule um lançamento de dados.
     * Lance o dado 100 vezes e armazene os resultados em 
     * um ArrayList. Depois, mostre quantas vezes cada 
     * valor foi conseguido. 
     * Dica: use um vetor de contadores(1-6) e uma função 
     * para gerar números aleatórios, simulando os 
     * lançamentos dos dados.
     */
    public static void main(String[] args) {
        
        Random r = new Random();
        int n = 100;
        int vetorCont[] = new int[6];   
        ArrayList<Integer> lancamentos = new ArrayList<>();
        
        System.out.println("Lancando dados:");
        for (int i = 0; i < n; i++) {
            int v = lancaDado(r);
            lancamentos.add(v);
            switch (v){          
                case 1:
                    vetorCont[0] += 1;
                    break;
                case 2:
                    vetorCont[1] += 1;
                    break;
                case 3:
                    vetorCont[2] += 1;
                    break;
                case 4:
                    vetorCont[3] += 1;
                    break;
                case 5:
                    vetorCont[4] += 1;
                    break;
                case 6:
                    vetorCont[5] += 1;
                    break;
            }           
        }
        System.out.println(lancamentos.toString());

        System.out.printf(
                        """
                        Quantidade para cada valor do dado
                        1: %d
                        2: %d
                        3: %d
                        4: %d  
                        5: %d
                        6: %d
                        """, vetorCont[0],vetorCont[1],vetorCont[2],vetorCont[3],vetorCont[4],vetorCont[5]);
    }
    public static int lancaDado(Random r){
        return r.nextInt(1, 7);   
    }
}
