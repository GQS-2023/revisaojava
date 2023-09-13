
package com.mycompany.revisao.Exercicio4;

/**
 *
 * @author rafaelamoreira
 */
public class Terraqueo extends PersonagemDragonBall {

    private String endereco;
   
    public Terraqueo(String nome, int idade, char sexo, long ki, String poderEspecial, String endereco) {
        super(nome, idade, sexo, ki, poderEspecial);
        this.endereco = endereco;     
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
    

}
