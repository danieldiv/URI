package contest;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;

        while ((n = s.nextInt()) < 1 || n > 1000) {
        }
        int[] vet = new int[n];
        for (int i = 2; i < n; i++) {
            vet[i] = i;
        }
        vet = primo(n, vet);
        for (int i : vet) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static int[] primo(int n, int vet[]) {
        for (int i = 1; i < n / 2; i++) {
            if (vet[i] != 0) {
                for (int j = (vet[i] + vet[i]); j < n; j += vet[i]) {
                    vet[j] = 0;
                }
            }
        }
        return vet;
    }

}
