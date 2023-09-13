
package com.mycompany.revisao.Exercicio4;

/**
 *
 * @author rafaelamoreira
 */
public class Saiyajin extends PersonagemDragonBall {
    private boolean temRabo;

    public Saiyajin(String nome, int idade, char sexo, long ki, String poderEspecial, boolean temRabo) {
        super(nome, idade, sexo, ki, poderEspecial);
        this.temRabo = temRabo;
    }

    public boolean isTemRabo() {
        return temRabo;
    }

    public void setTemRabo(boolean temRabo) {
        this.temRabo = temRabo;
    }

    public boolean transformar(int nivel) {
        boolean status = false;
        
        if ((nivel >= 1 && nivel <= 3) || ((super.getNome().equalsIgnoreCase("Goku") || super.getNome().equalsIgnoreCase("Vegeta")) && (nivel >= 4 && nivel <= 5))) {
            status = true;
        }
        return status;
    }

}
