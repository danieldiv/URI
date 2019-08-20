package string;

import java.io.IOException;
import java.util.Scanner;

public class Leitura_Mutipla {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String rastro;
        int P;

        while (sc.hasNext()) {
            rastro = sc.next();
            P = sc.nextInt();

            System.out.println(result(rastro.toCharArray(), P));
        }
    }

    public static int result(char[] array, int P) {
        int res = 0, cont = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'W') {
                res++;

                if (i != 0 && array[i - 1] == 'R' && cont != 0) {
                    res++;
                }
                cont = 0;
            } else {
                
                cont++;
                if (cont == P) {
                    res++;
                    cont = 0;
                }
            }
        }
        if (cont != 0) {
            res++;
        }
        return res;
    }
}


/*
Em diversos sistemas de computação, vários processos podem ler de um mesmo
recurso durante o mesmo ciclo de máquina, mas somente um processo pode escrever
no recurso durante o ciclo de máquina. Leituras e gravações não podem se
misturar em um mesmo ciclo de máquina. Dado um histórico de leituras e gravações
que ocorreram durante a execução de um determinado processamento, e um número
inteiro que representa o número de processos usados, calcule a duração mínima do
processamento, em ciclos de máquina. O rastro de histórico representa cada
leitura por uma letra 'R' e cada gravação por uma letra 'W'.

Por exemplo, se o rastro de histórico é "RWWRRR" e o número de processos é 3, 
então o número mínimo de ciclos de máquina será 4: um para a primeira leitura,
um para cada uma das gravações e apenas um para todo o último grupo de leituras.
 */
