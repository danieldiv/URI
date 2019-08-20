package ad_hoc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        int N, cont = 0;

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 6; i++) {
                N = sc.nextInt();

                if (map.get(N) != null) {
                    map.put(N, 1);
                } else {
                    map.put(N, 0);
                }
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                cont++;
            }
        }

        switch (cont) {
            case 6:
                System.out.println("sena");
                break;
            case 5:
                System.out.println("quina");
                break;
            case 4:
                System.out.println("quadra");
                break;
            case 3:
                System.out.println("terno");
                break;
            default:
                System.out.println("azar");
        }

    }
}
