package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

public class Contador_de_Tokens {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new TreeMap<>();
        ArrayList num = new ArrayList();
        String S[], x;

        S = sc.nextLine().split(" ");

        for (String s : S) {
            for (int i = 0; i < s.length() - 1; i++) {
                x = s.substring(i, i + 2).toLowerCase();

                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }
        
        num.addAll(map.values());
        Collections.sort(num);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), num.get(num.size() - 1))) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
                break;
            }
        }
    }
}
