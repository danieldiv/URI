/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest;

import java.util.Arrays;

/**
 *
 * @author Daniel
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 90, N2, P[], D[], x = 0, y = 0;

        int[] vetP = new int[N];
        for (int i = 2; i < N; i++) {
            vetP[i] = i;
        }

        P = new int[(int) Math.sqrt(N)];
        D = new int[N + 1];
        D[1] = 1;
        N2 = N;

        vetP = primo(N, vetP);

        for (int i : vetP) {
            if (i != 0) {
                if (i < Math.sqrt(N)) {
                    P[x] = i;
                    x++;
                }
            }
        }
        x = 0;
        String str = "";

        while (N != 1) {
            if (N % P[x] == 0) {
                N /= P[x];
                System.out.println(P[x]);
                str += String.valueOf(P[x]);
                str += " ";
            } else {
                x++;
                y = x;
            }

        }
        System.out.println("str: " + str);
        String[] s = str.split(str, ' ');
        int[] k = new int[s.length];

        System.out.println("l: " + s.length);

        for (int i = 0; i < s.length; i++) {
            System.out.println("i: " + i);
            k[i] = Integer.valueOf(s[i]);
        }

        System.out.println(Arrays.toString(k));

        int v = 0, teste = 1;
        x = 0;

//        while (true) {
//            System.out.println(Arrays.toString(P));
//            for (int i = 1; i < 9; i++) {
//                if (D[i] != 0) {
//                    System.out.println("i[" + i + "]: " + P[x] + " * " + D[i] + " = " + (P[x] * D[i]));
//
//                    v = P[x] * D[i];
//                    D[v] = v;
//
////                    if (v > teste) {
////                        teste = v;
////                        break;
////                    }
////                    if (v == 0) {
////                        break;
////                    }
//                }
//            }
//
//            for (int i : D) {
//                if (i != 0) {
//                    System.out.print(" " + i);
//                }
//            }
//            System.out.println();
////            if (v == 0) {
////                break;
////            }
////            t = v;
//
//            x++;
//            if (x == y + 1) {
//                break;
//            }
//        }
    }

    public static int[] primo(int n, int vet[]) {
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (vet[i] != 0) {
                for (int j = (vet[i] + vet[i]); j < Math.sqrt(n); j += vet[i]) {
                    vet[j] = 0;
                }
            }
        }
        return vet;
    }

}
