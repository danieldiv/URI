package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Impar_Par_ou_Roubo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        short p, j1, j2, r, a;
        int soma;

//        while (true) {
            p = sc.nextShort();
            j1 = sc.nextShort();
            j2 = sc.nextShort();
            r = sc.nextShort();
            a = sc.nextShort();

            soma = j1 + j2;

            /**
             * p == 0 : impar / p == 1 : par
             *
             * r == 0 : sem roubo / r == 1 : roubo
             *
             * a == 0 : sem acusacao /a == 1 : acusou roubo
             */
            //escolha de par
            if (p == 1) {
                //soma
                if (soma % 2 == 0) {
                    //roubo
                    if (r == 0) {
                        //acusacao
                        if (a == 0 || a == 1) {
                            System.out.println("Jogador 1 ganha!");
                        }
                    } else if (r == 1) {
                        if (a == 1) {
                            System.out.println("Jogador 2 ganha!");
                        } else {
                            System.out.println("Jogador 1 ganha!");
                        }
                    }
                } else if (soma % 2 == 1) {
                    //roubo
                    if (r == 0) {
                        //acusacao
                        if (a == 0 || a == 1) {
                            System.out.println("Jogador 2 ganha!");
                        }
                    } else if (r == 1) {
                        if (a == 0) {
                            System.out.println("Jogador 1 ganha!");
                        } else {
                            System.out.println("Jogador 2 ganha!");
                        }
                    }
                }
                //escolha de impar
            } else if (p == 0) {
                if (soma % 2 == 0) {
                    //roubo
                    if (r == 0) {
                        //acusacao
                        if (a == 0) {
                            System.out.println("Jogador 2 ganha!");
                        } else {
                            System.out.println("Jogador 1 ganha!");
                        }
                    } else if (r == 1) {
                        if (a == 1) {
                            System.out.println("Jogador 2 ganha!");
                        } else {
                            System.out.println("Jogador 1 ganha!");
                        }
                    }
                } else if (soma % 2 == 1) {
                    //roubo
                    if (r == 0) {
                        //acusacao
                        if (a == 0 || a == 1) {
                            System.out.println("Jogador 1 ganha!");
                        }
                    } else if (r == 1) {
                        if (a == 0) {
                            System.out.println("Jogador 1 ganha!");
                        } else {
                            System.out.println("Jogador 2 ganha!");
                        }
                    }
                }
//            }

        }
    }
}

/**
 * 2 jogadores
 *
 * j1, j2 = numero jogadores
 *
 * 1 - par 0 - impar
 *
 * soma = j1 + j2
 *
 * r - roubo
 *
 * 0 - sem roubo 1 - roubo
 *
 * 0 - sem acusacao 1 - acusacao
 *
 * se o jogador 1 roubar e o jogador 2 acusar o roubo então o jogador 2 ganha
 *
 * caso o jogador 2 não acuse o roubo e o jogador 1 roubar então o jogador 1
 * ganha
 *
 * caso o jogador 2 acuse o roubo, mas o jogador 1 não tiver roubado então o
 * jogador 1 ganha
 *
 * se o jogador 1 não roubar e o jogador 2 não acusar o roubo o jogo segue como
 * descrito anteriormente.
 */
