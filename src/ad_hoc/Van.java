package ad_hoc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//terminar
public class Van {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int Q, cont;
        String[] A;
        Integer[] N, aux;
        String[][] P;
        char[] C;

        while (sc.hasNext()) {
            Q = Integer.parseInt(sc.nextLine());

            A = new String[Q];
            N = new Integer[Q];
            aux = new Integer[Q];
            P = new String[Q][];

            for (int i = 0; i < Q; i++) {
                System.out.println(i);
                A[i] = sc.nextLine();

                P[i] = A[i].split(" ");
                N[i] = Integer.parseInt(P[i][2]);
            }

            mergeSort(N);

            for (int i = 0; i < aux.length; i++) {
                aux[i] = 0;
            }

            for (int i = 0; i < N.length; i++) {
                for (Integer n : N) {
                    if (N[i].equals(n)) {
                        aux[i]++;
                    }
                }
            }

            cont = 0;
            for (Integer i : aux) {
                if (i > 1) {
                    cont++;
                }
            }
            
            for (int i = 0; i < cont; i++) {
//                C[i] = 
            }

            C = new char[cont];
            
            System.out.println(Arrays.toString(C));
            System.out.println(Arrays.toString(aux));

//            for (int i = 0; i < N.length - 1; i++) {
//                if (N[i].equals(N[i + 1])) {
//                    System.out.print(".eq");
//                } else {
//                    System.out.print(".n");
//                }
//            }
//            System.out.println();
            System.out.println(Arrays.toString(A));
            System.out.println(Arrays.toString(N));
        }

    }

    //<editor-fold defaultstate="collapsed" desc="Merger Sort">
    public static void mergeSort(Comparable[] a) {
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, tmp, 0, a.length - 1);
    }

    private static void mergeSort(Comparable[] a, Comparable[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    private static void merge(Comparable[] a, Comparable[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            if (a[left].compareTo(a[right]) <= 0) {
                tmp[k++] = a[left++];
            } else {
                tmp[k++] = a[right++];
            }
        }

        while (left <= leftEnd) // Copy rest of first half
        {
            tmp[k++] = a[left++];
        }

        while (right <= rightEnd) // Copy rest of right half
        {
            tmp[k++] = a[right++];
        }

        // Copy tmp back
        for (int i = 0; i < num; i++, rightEnd--) {
            a[rightEnd] = tmp[rightEnd];
        }
    }
//</editor-fold>
}
