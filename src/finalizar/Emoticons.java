package finalizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ad-hoc
public class Emoticons {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String[] valor, emoticon, texto;
        int N, M;

        while (true) {
            valor = in.readLine().split(" ");

            N = Integer.parseInt(valor[0]);
            M = Integer.parseInt(valor[1]);

            if (N == 0 && M == 0) {
                break;
            }

            emoticon = new String[N];
            texto = new String[M];

            for (int i = 0; i < N; i++) {
                emoticon[i] = in.readLine();
            }

            for (int i = 0; i < M; i++) {
                texto[i] = in.readLine();
            }

            String aux = "", res = "", teste[];
            int cont;
            boolean b = false;

            for (String str : texto) {
                teste = str.split(" ");
                System.out.println("str: " + str);
                System.out.println("teste: " + Arrays.toString(teste));

                for (String t : teste) {

                    for (int i = 0; i < t.length(); i++) {
                        System.out.println("str-: " + t);
                        cont = 0;

                        for (String em : emoticon) {
                            if (t.length() >= em.length()) {
                                if (i + em.length() <= t.length()) {
//                            System.out.println("i: " + i);
//                            System.out.println("i2: " + (i + em.length()));
                                    aux = t.substring(i, (i + em.length()));

                                    System.out.println("aux: " + aux);
//                            System.out.println("aux: " + aux + " @@@ " + em);

                                    if (aux.equals(em)) {
//                                System.out.println("quebra");
                                        res += "@";
//                                System.out.println("res: " + res);
                                        break;
                                    } else {
                                        cont++;
                                    }
                                } else {
                                    b = true;
                                }
                            }else{
                                System.out.println("here");
                                i++;
                            }
                        }
                        System.out.println("pass");
                        if (cont == emoticon.length) {
                            res += aux;
//                        System.out.println("res: " + res);
                        }
                    i += aux.length() - 1;
                    }
                }
                System.out.println("res: " + res);

//                for (String em : emoticon) {
////                    System.out.println("em = " + em);
////                    System.out.println(" x = " + x);
//                    aux = str.substring(x, (x + em.length()));
//
//                    if (aux.equals(em)) {
//                        break;
//                    }
//                    System.out.println("aux: " + aux);
//                }
//                x += aux.length();
            }
        }
    }

    /**
     * ordena um array pelo tamanho da string
     *
     * @param emoticon
     * @return
     */
    public static String[] ordernaArray(String[] emoticon) {
        int tam[];
        String R[];

//        System.out.println("antes: " + Arrays.toString(emoticon));
        tam = new int[emoticon.length];
        R = new String[emoticon.length];

        for (int j = 0; j < tam.length; j++) {
            tam[j] = emoticon[j].length();
        }

        Arrays.sort(tam);

        for (int j = 0; j < tam.length; j++) {
            for (int k = 0; k < emoticon.length; k++) {
                if (emoticon[k].length() == tam[tam.length - (j + 1)] && (!emoticon[k].equals("@"))) {
                    R[j] = emoticon[k];
                    emoticon[k] = "@";
                    break;
                }
            }
        }
//        Arrays.sort(emoticon);
//        Arrays.sort(R);
//        System.out.println("tam1: " + emoticon.length);
//        System.out.println("tam2: " + R.length);
//        System.out.println("a: " + Arrays.toString(emoticon));

//        System.out.println("depois: "+  Arrays.toString(emoticon));
        return R;
    }

    /**
     * Exclui valor repetidos
     *
     * @param emoticon
     * @return
     */
    public static String[] excluirValorRepetido(String[] emoticon) {
        String aux;
        int x = 0;

        while (x < emoticon.length - 1) {
            aux = emoticon[x];

            for (int i = x + 1; i < emoticon.length; i++) {
                if (i >= emoticon.length) {
                    break;
                }
                if (emoticon[i].equals("@")) {
                    break;
                }
                if (aux.equals(emoticon[i])) {
                    emoticon[i] = "@";
                }
            }
            x++;
        }
        return emoticon;
    }
}
