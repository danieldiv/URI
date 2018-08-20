package iniciante.entrada_saida;

import java.io.IOException;

public class Saida_6 {

    public static void main(String[] args) throws IOException {
        String S = "AMO FAZER EXERCICIO NO URI";
        
        System.out.printf("<%s>\n", S);
        System.out.printf("<%30s>\n", S);
        System.out.printf("<%.20s>\n", S);
        System.out.printf("<%-20s>\n", S);
        System.out.printf("<%-30s>\n", S);
        System.out.printf("<%.30s>\n", S);
        System.out.printf("<%30.20s>\n", S);
        System.out.printf("<%-30.20s>\n", S);

    }
}
