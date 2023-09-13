/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao.Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Principal {

    public static void main(String[] args) {

        testaFuncionario();

    }

    public static void testaFuncionario() {

        List<Funcionario> f = new ArrayList<>();
        int cont = f.size() + 1;

        Scanner input = new Scanner(System.in);
        int opcao;
        int id;

        while (true) {
            exibeMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // inserir funcionario
                    f.add(inputData(cont, input));
                    break;
                case 2: // listar funcionarios
                    if (!f.isEmpty()) {
                        listarFuncionarios(f);
                    } else {
                        System.out.println("Nenhum funcionário inserido!");
                    }
                    break;
                case 3: // aumentar salario
                    System.out.println("Informe o id do funcionario: ");
                    id = input.nextInt();

                    if (!f.isEmpty() && (id - 1) < f.size()) {
                        System.out.println("Informe o percentual de aumento: ");
                        double percentual = input.nextDouble();
                        f.get(id - 1).aumentarSalario(percentual);
                    } else {
                        System.out.println("Funcionário não encontrado!");
                    }
                    break;
                case 4: // aniversario
                    System.out.println("Informe o id do funcionario: ");
                    id = input.nextInt();
                    if (!f.isEmpty() && (id - 1) < f.size()) {
                        f.get(id - 1).fazerAniversario();
                    } else {
                        System.out.println("Funcionário não encontrado!");
                    }
                    break;
                case 5: // promover
                    System.out.println("Informe o id do funcionario: ");
                    id = input.nextInt();
                    if (!f.isEmpty() && (id - 1) < f.size()) {
                        f.get(id - 1).promover();
                    } else {
                        System.out.println("Funcionário não encontrado!");
                    }
                    break;
                case 6: // sair
                    System.out.println("ATÉ LOGO!!!!");
                    System.exit(0);
                default:
                    System.out.println("OPCAO INVALIDA!!!!");
            }
        }
    }

    public static void exibeMenu() {
        System.out.println("-------------------");
        System.out.println("Escolha uma opcao: ");
        System.out.println("[1] Inserir Funcionario");
        System.out.println("[2] Listar Funcionarios");
        System.out.println("[3] Aumentar salario de um Funcionario");
        System.out.println("[4] Aniversario do Funcionario");
        System.out.println("[5] Promover Funcionario");
        System.out.println("[6] Sair");
        System.out.println("-------------------");
    }

    public static void limparBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static Funcionario inputData(int i, Scanner scan) {

        System.out.println("Informe o nome do funcionário " + i + " : ");
        String nome = scan.nextLine();
        limparBuffer(scan);
        System.out.println("Informe a idade do funcionario " + i + " : ");
        int idade = scan.nextInt();

        System.out.println("Informe o salario do funcionario " + i + " : ");
        double salario = scan.nextDouble();

        return new Funcionario(i, nome, idade, salario);
    }

    public static void listarFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("---------------------------");
        System.out.println("Funcionarios:");
        System.out.println("---------------------------");

        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
            System.out.println("---------------------------");
        }
    }

}
