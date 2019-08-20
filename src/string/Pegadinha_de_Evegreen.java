package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Pegadinha_de_Evegreen {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int N;

        String nome, sobrenome;

        N = Integer.parseInt(in.readLine());

        for (int i = 0; i < N; i++) {
            nome = in.readLine();
            sobrenome = in.readLine();

            System.out.println("+: " + nome + "-" + sobrenome);
        }
    }
}
