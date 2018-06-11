package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codigo_Secreto {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String N, S, abc = "abcdefghijklmnoprstuvwxyz";
        String codigos[] = {".", "..", "...", ". .", ".. ..", "... ...",
            ". . .", ".. .. ..", "... ... ...", ". . . .", ".. .. .. ..",
            "... ... ... ...", ". . . . .", ".. .. .. .. ..",
            "... ... ... ... ...", ". . . . . .", ".. .. .. .. .. ..",
            "... ... ... ... ... ...", ". . . . . . .", ".. .. .. .. .. .. ..",
            "... ... ... ... ... ... ...", ". . . . . . . .",
            ".. .. .. .. .. .. .. ..", "... ... ... ... ... ... ... ...",
            ". . . . . . . . .", ".. .. .. .. .. .. .. .. .."};

        while ((N = in.readLine()) != null) {
            for (int i = 0; i < Integer.parseInt(N); i++) {
                S = in.readLine();
                
                System.out.println(decod(S, abc, codigos));
            }
        }
    }

    public static char decod(String s, String abc, String cod[]) {
        for (int i = 0; i < cod.length; i++) {
            if(s.equals(cod[i])){
                return abc.charAt(i);
            }
        }
        return ' ';
    }
}

/*
. → a
.. → b
... → c
. . → d
.. .. → e
... ... → f
. . . → g
.. .. .. → h
... ... ... → i
. . . . → j
.. .. .. .. → k
... ... ... ... → l
. . . . . → m
.. .. .. .. .. → n
... ... ... ... ... → o
. . . . . . → p
.. .. .. .. .. .. → q
... ... ... ... ... ... → r
. . . . . . . → s
.. .. .. .. .. .. .. → t
... ... ... ... ... ... ... → u
. . . . . . . . → v
.. .. .. .. .. .. .. .. → w
... ... ... ... ... ... ... ... → x
. . . . . . . . . → y
.. .. .. .. .. .. .. .. .. → z*/
