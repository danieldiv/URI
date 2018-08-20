package contest.aquecimento_OBI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Papagaio_Poliglota {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String S;

        while ((S = in.readLine()) != null) {
            System.out.println(result(S));
        }
    }

    public static String result(String S) {
        switch (S) {
            case "esquerda":
                S = "ingles";
                break;
            case "direita":
                S = "frances";
                break;
            case "nenhuma":
                S = "portugues";
                break;
            case "as duas":
                S = "caiu";
                break;
        }
        return S;
    }
}
