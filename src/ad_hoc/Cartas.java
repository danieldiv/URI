package ad_hoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Cartas {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str[], valor;
        int[] array, aux;

        str = in.readLine().split(" ");
        array = new int[str.length];
        aux = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }

        System.arraycopy(array, 0, aux, 0, array.length);
        Arrays.sort(array);

        valor = (aux[0] < aux[aux.length - 1] ? "C" : "D");

        System.out.println(result(valor, aux, array));

    }

    public static String result(String valor, int[] aux, int[] array) {
        switch (valor) {
            case "C":
                for (int i = 0; i < aux.length; i++) {
                    if (aux[i] != array[i]) {
                        return "N";
                    }
                }
                return "C";
            case "D":
                int j = array.length - 1;
                for (int i = 0; i < aux.length; i++) {
                    if (aux[j] != array[i]) {
                        return "N";
                    }
                    j--;
                }
                return "D";
            default:
                return "N";
        }
    }
}
