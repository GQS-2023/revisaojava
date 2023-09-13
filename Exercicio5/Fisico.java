/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao.Exercicio5;

/**
 *
 * @author rafaelamoreira
 */
public class Fisico extends Cliente{
    private String cpf;
    
    public Fisico(int codigo, String nome, String telefone, String email, Endereco endereco, String cpf) {
        super(codigo, nome, telefone, email, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
