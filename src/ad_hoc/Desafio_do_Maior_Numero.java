package ad_hoc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio_do_Maior_Numero {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList<>();
        String str;

        while (!(str = sc.next()).equals("0")) {
            lista.add(str);
        }

        String[] string = lista.toArray(new String[lista.size()]);
        int[] array = Arrays.stream(string).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);

        System.out.println(array[array.length - 1]);
    }
}
