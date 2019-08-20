package ad_hoc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedagio {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int L, D, K, P, res;

        List<Integer> lista = new ArrayList<>();

        L = sc.nextInt();
        D = sc.nextInt();
        K = sc.nextInt();
        P = sc.nextInt();

        for (int i = D; i <= L; i += D) {
            lista.add(i);
        }

        res = (L * K) + (lista.size() * P);
        
        System.out.println(res);

    }
}
