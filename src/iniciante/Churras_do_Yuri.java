package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Churras_do_Yuri {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, aux[];
        Integer V[];
        String D[];

        while (sc.hasNext()) {
            N = sc.nextInt();

            D = new String[N];
            V = new Integer[N];
            aux = new int[N];

            for (int i = 0; i < N; i++) {
                D[i] = sc.next();
                V[i] = sc.nextInt();
                aux[i] = V[i];
            }

            mergeSort(V);

            for (Integer v : V) {
                for (int j = 0; j < N; j++) {
                    if (v == aux[j]) {
                        System.out.print(D[j]);

                        if (j < N - 1) {
                            System.out.print(".");
                        }
                    }
                }
            }
            System.out.println();
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
