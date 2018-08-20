package contest.aquecimento_OBI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_Troca_de_Mensagens {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        char abc[], cifra[][];
        String K, S[], _S[];
        int N;

        abc = new char[26];
        cifra = new char[26][26];

        preencheABC(abc);
        preencheCifra(cifra, abc);

        K = in.readLine();
        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            S = in.readLine().split(" ");
            _S = new String[S.length];

            formataPalavra(S, _S, K);

            for (int j = 0; j < S.length; j++) {
                S[j] = encriptaMensagem(S[j], _S[j], cifra);
                System.out.print(S[j]);

                if (j < S.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    /**
     * Cria uma matriz de abc deslocando uma posicao a esquerda em cada linha
     *
     * @param cifra
     * @param abc
     */
    public static void preencheCifra(char[][] cifra, char[] abc) {
        int cont = 0, aux;

        for (int i = 0; i < 26; i++) {
            aux = 0;

            for (int j = 0; j < 26; j++) {
                if (cont + j < 26) {
                    cifra[i][j] = abc[j + cont];
                } else {
                    cifra[i][j] = abc[aux++];
                }
            }
            cont++;
        }
    }

    /**
     * Cria um vetor com as letras do alfabeto
     *
     * @param abc
     */
    public static void preencheABC(char[] abc) {
        for (int i = 0; i < 26; i++) {
            abc[i] = (char) (i + 97);
        }
    }

    /**
     * Encripta a mensagem passando o valor de 'c' como coluna e 'o' como lnha
     *
     * ciencia da computacao - obiobio bi obiobiobio
     *
     * @param S
     * @param _S
     * @param cifra
     * @return
     */
    public static String encriptaMensagem(String S, String _S, char[][] cifra) {
        char[] P = S.toCharArray();

        if (verificaVogal(S)) {
            return S;
        } else {
            for (int i = 0; i < P.length; i++) {
                P[i] = cifra[(int) _S.charAt(i) - 97][(int) S.charAt(i) - 97];
            }
        }

        return String.copyValueOf(P);
    }

    /**
     * Transforma a frase pela sequencia da chave
     *
     * EX: chave (obi) - ciencia da computacao = obiobio bi obiobiobio
     *
     * @param S
     * @param _S
     * @param K
     */
    public static void formataPalavra(String[] S, String[] _S, String K) {
        char[] fp;
        int cont = 0;

        for (int i = 0; i < S.length; i++) {
            if (!verificaVogal(S[i])) {
                fp = new char[S[i].length()];

                for (int j = 0; j < fp.length; j++) {
                    fp[j] = K.charAt(cont);
                    cont = (cont < K.length() - 1) ? ++cont : 0;
                }
                _S[i] = String.copyValueOf(fp);
            } else {
                _S[i] = S[i];
            }
        }
    }

    /**
     * Verifica se palavra incia com vogal
     *
     * @param S
     * @return
     */
    public static boolean verificaVogal(String S) {
        switch (S.charAt(0)) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
        }
        return false;
    }
}
