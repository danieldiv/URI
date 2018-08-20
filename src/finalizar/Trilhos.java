package finalizar;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Trilhos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, x, y;
        int[] pA, pB, pE;
        boolean cond_1;

        while ((N = sc.nextInt()) != 0) {
            cond_1 = true;

            while (cond_1) {
                pA = new int[N];
                pB = new int[N];
                pE = new int[N];

                x = 0;

                for (int i = 0; i < N; i++) {
                    pA[i] = sc.nextInt();

                    if (pA[i] == 0) {
                        cond_1 = false;
                        break;
                    }
                }

                y = N - 1;

                if (cond_1) {
                    for (int i = N - 1; i >= 0; i--) {

//                        System.out.println("pA: " + pA[i] + " - pE: " + pE[y] + " - y: " + y + " - (N-x): " + (N - x));
//                        System.out.println("A" + Arrays.toString(pA));
//                        System.out.println("B" + Arrays.toString(pB));
//                        System.out.println("E" + Arrays.toString(pE));
//                        System.out.println("-");
                        if (pA[i] == N - x) {
                            pB[x] = pA[i];
                            pA[i] = -1;

                            x++;
//                            System.out.println("a");
                        } else if (pE[y] == N - x) {
                            pB[x] = pE[y];
                            pE[y] = -2;

                            x++;
                            y--;
//                            System.out.println("b");
                        } else if (y < N - 1 && pE[y + 1] == N - x) {
                            pB[x] = pE[y + 1];

//                            System.out.println("pE2: " + pE[y]);
//                            System.out.println("pE2: " + pE[y + 1]);
//                            System.out.println(Arrays.toString(pE));
                            pE[y + 1] = -2;

                            x++;
                            i++;
//                            y++;
//                            System.out.println("c");
                        } else {
                            pE[y] = pA[i];
                            pA[i] = -3;

                            y--;
//                            System.out.println("d");
                        }
                    }

                    if (x != N - 1) {
                        for (int i = x; i < N; i++) {
//                            System.out.print(i + ".");
                            if (pE[i] + 1 == pB[i - 1]) {
                                pB[i] = pE[i];
                                pE[i] = -4;
                            }
                        }
//                        System.out.println();
                    }
//                    System.out.println("pn-1: " + pB[N - 1]);
//                    System.out.println("pn-2: " + pB[N - 2]);
//                    System.out.println("n-1: " + (N - 1));
//                    System.out.println("n-2: " + (N - 2));
                    if (pB[N - 1] == 0 && pB[N - 2] == 2) {
                        for (int i = 1; i < pE.length; i++) {
                            if (pE[i - 1] == 0 && pE[i] == 1) {
                                pB[N - 1] = pE[i];
                                pE[i] = -5;
                            }
                        }
                    }
                    System.out.println((pB[N - 1] == 1) ? "Yes" : "No");
                    System.out.println(Arrays.toString(pB));
                    System.out.println(Arrays.toString(pE));
//                    System.out.println("A*" + Arrays.toString(pA));
//                    System.out.println("B*" + Arrays.toString(pB));
//                    System.out.println("E*" + Arrays.toString(pE));
//                    System.out.println("-");
                }
            }
            System.out.println();
        }
    }
}
