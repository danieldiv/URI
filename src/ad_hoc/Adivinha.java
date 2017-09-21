package ad_hoc;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Adivinha {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Integer N, QT, S, p, QTs[];
        int teste[];

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            p = 0;

            QT = sc.nextInt();
            S = sc.nextInt();

            QTs = new Integer[QT + 1];
            teste = new int[QT];

            for (int j = 0; j < QT; j++) {
                QTs[j] = sc.nextInt();

                teste[j] = QTs[j];

                if (p == 0 && Objects.equals(QTs[i], S)) {
                    p = (j + 1);
                }
            }

            if (p != 0) {
                System.out.println(p);
            } else {
                QTs[QTs.length - 1] = S;
                mergeSort(QTs);

                for (int j = 0; j < QTs.length; j++) {
                    if (Objects.equals(QTs[j], S)) {
                        p = j;
                        break;
                    }
                }

                if (p > 0 && p < QTs.length - 1) {

                    Integer n1 = QTs[p] - QTs[p - 1];
                    Integer n2 = QTs[p + 1] - QTs[p];

                    if (n1 < n2) {
                        for (int j = 0; j < QTs.length; j++) {
                            if (Objects.equals(QTs[p - 1], teste[j])) {
                                p = j + 1;
                                break;
                            }
                        }
                        System.out.println(p);
                    } else {
                        for (int j = 0; j < QTs.length; j++) {
                            if (Objects.equals(QTs[p + 1], teste[j])) {
                                p = j + 1;
                                break;
                            }
                        }
                        System.out.println(p);
                    }
                } else if (p == 0) {
                    System.out.println(teste[p + 1]);
                } else {
                    System.out.println(teste[teste.length - 1]);
                }
            }
        }
    }

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
}
