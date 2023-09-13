
package com.mycompany.revisao.Exercicio4;

/**
 *
 * @author rafaelamoreira
 */
public abstract class PersonagemDragonBall {
    private String nome;
    private int idade;
    private char sexo;
    private long ki;
    private String poderEspecial;

    public PersonagemDragonBall(String nome, int idade, char sexo, long ki, String poderEspecial) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.ki = ki;
        this.poderEspecial = poderEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public long getKi() {
        return ki;
    }

    public void setKi(long ki) {
        this.ki = ki;
    }

    public String getPoderEspecial() {
        return poderEspecial;
    }

    public void setPoderEspecial(String poderEspecial) {
        this.poderEspecial = poderEspecial;
    }
    
       
}

