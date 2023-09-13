/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao.Exercicio5;

/**
 *
 * @author rafaelamoreira
 */
public class Juridico extends Cliente {
    private String cnpj;
    private String nomeFantasia;

    public Juridico(int codigo, String nome, String telefone, String email, Endereco endereco, String cnpj, String nomeFantasia) {
        super(codigo, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
     
}
