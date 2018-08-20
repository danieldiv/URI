package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest_Object {

    public static void main(String[] args) throws IOException {

        Map<Integer, Integer[]> teste = new HashMap<>();
        Map<Integer, String> m = new HashMap<>();

        Integer[] t = {1, 5, 2}, t2 = {6, 25, 3};

        teste.put(0, t);
        teste.put(1, t2);

        String S = "teste";

        m.put(2, S);
        m.put(2, S+="7");
        S = "tt";
        m.put(1, S);

        System.out.println(m);

//        teste.entrySet().stream().forEach((entry) -> {
//            System.out.println(entry.getKey() + "-" + Arrays.toString(entry.getValue()));
//        });
//
//        System.out.println(Arrays.toString(teste.get(0)));
//        System.out.println(Arrays.toString(teste.get(1)));
//
////        Map<Integer, Integer> map = new HashMap<>(); //ordena da maneira que achar melhor
//        /* Criação do Map, onde o mesmo irá utilizar como chave o nome da empresa para mapear as                                                         informações, que estarão em um Array de Object*/
//        Map<String, Object[]> mapa = new HashMap<String, Object[]>();
//
//        /* As informações são passadas através de Arrays de Strings, cada Array contém uma informação                                                    específica.*/
//        String[] localizacao = {"endereco", "cnpj", "cidade", "estado"};
//        String[] setores = {"vendas", "comercial", "suporte"};
//        String[] funcionarios = {"Alberto", "Henrique", "Ana"};
//        String[] projetos = {"projeto1", "projeto2", "projeto3"};
//
//        //É criado uma variável para armazenar os objetos (cada array é um objeto)
//        Object[] informacoes = {localizacao, setores, funcionarios, projetos};
//
//        mapa.put("Empresa", informacoes); // é feito o mapeamento entre a empresa e seus dados
//
//        // Os dados foram mapeados, vamos ver como recuperá-los.
//        /* é criado um array de Object para recuperar os dados mapeados, observe que no método get de                                                 HashMap é passado o parâmetro "Empresa". Será retornado as informações que estão mapeadas com                                         a empresa passada como parâmetro. Se vc tivesse passado como parâmetro a empresa "IBM" e                                                     existisse um mapeamento para essa empresa, as informações sobre a IBM retornariam no Array                                                     recDados*/
//        Object[] recDados = mapa.get("Empresa");
//
//        for (Object recDado : recDados) {
//            System.out.println(Arrays.toString((String[]) recDado));
//            for (String s : (String[]) recDado) {
////                System.out.println("-" + s); // imprime o item para cada array de strings
//            }
//        }
////        for (int i = 0; i < recDados.length; i++) // array para iterar entre as informações
////        {
////
////            // switch utilizado para exibir a informação que está sendo impressa.
////            switch (i) {
////                case 0:
////                    System.out.println("Localização: ");
////                    break;
////                case 1:
////                    System.out.println("Setores: ");
////                    break;
////                case 2:
////                    System.out.println("Funcionários: ");
////                    break;
////                case 3:
////                    System.out.println("Projetos: ");
////                    break;
////            }
////            /*Como o array recDados é do tipo Object e eu tenho a informação que ele armazena array                                                                de strings, eu devo fazer um Cast para String[]*/
////
////            for (String s : (String[]) recDados[i]) {
////                System.out.println(s); // imprime o item para cada array de strings
////            }
////
////            System.out.println(); // espaço após terminar a impressão da informação
////        }
    }

}
