
package com.mycompany.revisao.Exercicio4;

/**
 *
 * @author rafaelamoreira
 */
public class TestaDragonBall {

    public static void main(String[] args) {
        
        PersonagemDragonBall p1 = new Terraqueo("Kuririn", 44, 'm', 1000000, "agilidade", "Case de Kame");
        PersonagemDragonBall p2 = new Saiyajin("Goku", 35, 'm', 150000000, "kamehameha", false);
        PersonagemDragonBall p3 = new Saiyajin("Gohan", 23, 'm', 70000000, "kamehameha", true);
        PersonagemDragonBall p4 = new Namekian("Dende", 5, 'm', 500000, "cura", 7, true);

        verificaTransformacao(p2, 4);
        verificaTransformacao(p3, 1);
        String pedido = "Ressuscitar Piccolo e mandar para Namekusei.";
        fazerPedido(p4, pedido);
    }

    public static void verificaTransformacao(PersonagemDragonBall p, int nivel) {
        if (p instanceof Saiyajin s) {
            if (s.transformar(nivel) == true) {
                System.out.println(p.getNome() + " transformou para super saiyajin nível " + nivel + ".");
            } else {
                System.out.println("Não foi possível transformar esse saiyajin.");
            }
        }else{
            System.out.println(p.getClass().getSimpleName() + " não pode transformar em Saiyajin.");
        }
    }

    public static void fazerPedido(PersonagemDragonBall p, String pedido) {
        if (p instanceof Namekian n) {
            String pedidoCodificado = n.transformarPedido(pedido);
            System.out.println(pedidoCodificado);
        }else{
            System.out.println(p.getClass().getSimpleName() + " não pode fazer pedido.");
        }
    }
}
