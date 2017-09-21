package contest;

import java.io.IOException;
import java.util.Scanner;

public class Folha_de_Pagamento {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N, M;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            M = sc.nextInt();
            
        }

    }

    public static int valida(int M) {
        int[] vet = new int[M];
        for (int i = 1; i < M; i++) {
            vet[i] = i;
        }
        
        vet = primo(M, vet);
        
        int cont = 0;

        for (int i = 1; i <= M; i++) {
            if (M % i == 0) {
                cont += i;
            }
        }
        return cont;
    }
    
    public static int[] primo(int n, int vet[]) {
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (vet[i] != 0) {
                for (int j = (vet[i] + vet[i]); j < n; j += vet[i]) {
                    vet[j] = 0;
                }
            }
        }
        return vet;
    }
}
