/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciante;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Pedra_Papel_AtaqueAereo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 2;
        String jog1, jog2;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            jog1 = sc.next();
            jog2 = sc.next();

            System.out.println(verifica(jog1, jog2));;
        }
        System.out.println();
    }

    /**
     * Verifica se alguem ganhou ou empatou
     *
     * @param j1
     * @param j2
     * @return
     */
    public static String verifica(String j1, String j2) {
        String str = null;

        //Ambos vencedores
        if (j1.equals("papel") && j2.equals("papel")) {
            str = "Ambos venceram";
        } //Aniquilacao mutua
        else if (j1.equals("ataque") && j2.equals("ataque")) {
            str = "Aniquilacao mutua";
        } //Sem ganhador
        else if (j1.equals(j2)) {
            str = "Sem ganhador";
        } //Jogador 1
        else if (j1.equals("ataque") && j2.equals("pedra")) {
            str = "Jogador 1 venceu";
        } else if (j1.equals("pedra") && j2.equals("papel")) {
            str = "Jogador 1 venceu";
        } else if (j1.equals("ataque") && j2.equals("papel")) {
            str = "Jogador 1 venceu";
        } //Jogador 2
        else if (j1.equals("pedra") && j2.equals("ataque")) {
            str = "Jogador 2 venceu";
        } else if (j1.equals("papel") && j2.equals("pedra")) {
            str = "Jogador 2 venceu";
        } else if (j1.equals("papel") && j2.equals("ataque")) {
            str = "Jogador 2 venceu";
        }

        return str;
    }
}
