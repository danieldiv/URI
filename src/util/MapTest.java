package util;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) throws IOException {
//        Map<Integer, Integer> map = new HashMap<>(); //ordena da maneira que achar melhor
//        Map<Integer, Integer> map = new TreeMap<>(); //ordena as chaves em ordem crescente
        Map<Integer, Integer> map = new LinkedHashMap<>();//nao ordena as chaves

        map.put(22, 3);
        map.put(11, 2);
        map.put(39, 3);
        
        int chave = 22;
        
        if (map.get(chave) != null) {
            System.out.println(map.get(chave));
            map.put(chave, map.get(chave) + 2);
            System.out.println(map.get(chave));
        } else {
            System.out.println("nulo");
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
