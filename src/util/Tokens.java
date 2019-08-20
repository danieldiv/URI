package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tokens {

    public static void main(String[] args) throws IOException {
        ArrayList array = new ArrayList<>();
        StringTokenizer token;
        String str;

        str = "{ABC}+{CDE}*{CEZ}";
        token = new StringTokenizer(str, "{}");

        while (token.hasMoreElements()) {
            Object nextElement = token.nextElement();
            array.add(nextElement);
        }
        System.out.println(array);
        System.out.println(array.indexOf("*"));

        System.out.println(str.indexOf("*"));
    }
}

/**
 * File f = new File("Teste.txt"); String linha = ""; String inteiro = "";
 * String texto = ""; Scanner s;
 *
 * try { FileWriter fw = new FileWriter(f); // Cria o nosso arquivo
 * fw.append("Tiago 23 Argolo"); // Seta seu conteúdo. fw.flush(); fw.close(); }
 * catch (IOException e) { }
 *
 * // Obtendo o arquivo e suas informações try { FileReader fr = new
 * FileReader(f); BufferedReader br = new BufferedReader(fr); linha =
 * br.readLine(); System.out.println("linha: " + linha);
 *
 * s = new Scanner(linha);
 *
 * // while (s.hasNext()) { // System.out.println("si: " + s.hasNextInt()); //
 * System.out.println("s: " + s.next()); // }
 *
 * boolean b;
 *
 * while (b = s.hasNext()) // verifica se tem outro valor. { if (s.hasNext()) //
 * verifica se o próximo valor é inteiro { inteiro += " " + s.next(); } else //
 * CAso não for inteiro. { texto += " " + s.next(); } }
 *
 * } catch (IOException e) { }
 *
 * // A partir daqui, posso utilizar ambas a variáveis em outros objetos // que
 * serão utilizados pela minha aplicação. System.out.println("Textos" + texto +
 * "\nInteiros: " + inteiro);
 */
