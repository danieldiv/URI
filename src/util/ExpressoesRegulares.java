package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {

    public static void main(String[] args) {

        // \d - busca todos os digitos (numeros) 
        // \D - tudo que nao for digito 
        // \s - espacos em branco \t \n \f \r \S - caracter que nao e branco 
        // \w - caracteres de palavras a-z A-Z digitos e _ 
        // \W - tudo o que nao for caracter de palavra 
        // [] - agrupamento de expressoes (a-z A-Z 0-9 0[xX][0-9a-fA-F])
        // !#$%&'()*+,-./:;?@[\\\\]_`{|}~ -> caracteres especiais
        //
        // QUANTIFICADORES
        //
        // ? - zero ou um
        // * - zero ou mais 
        // + - uma ou mais
        // {n,m} - vai ser n ate m
        // () - agrupar
        // | - ou
        // $ - fim de linha
        // o(v|c)o = ovo, oco
        // maca(rr|c)ão = macarrão, macacão
        // ^ - negacao [^abc]
        //
        //--------------
//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0xFFABC 0X10G 0x1 ";
//        -
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-z])+(\\.([a-zA-z])+)+";//([\\w\\._-])+@([\\w])+(\\.([\\w])+)+
//        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@abrao@mail.br, teste@gmail.com.br.br, teste@mail";
//        System.out.println("email valido: " + "#@abrao@mail.br".matches(regex));
//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";//\\d\\d/\\d\\d/\\d\\d\\d\\d
//        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95";//dd/MM/yyyy

        String regex = "proj([^,])";
        String texto = "proj1.bkp, proj1.java, proj1.class proj1final.java, proj2.bkp, proj3.java, diagrama, texto";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 123456789");

        System.out.println("expressao: " + matcher.pattern());
        System.out.println("posicao encontrada");

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
