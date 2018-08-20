package estruturas_bibliotecas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tradutor_do_Papai_Noel {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        Map<String, String> mapa = new HashMap<>();
        String S;
        
        preencheVetor(mapa);
        
        while (sc.hasNext()) {
            S = sc.next();

            if (mapa.get(S) == null) {
                System.out.println("--- NOT FOUND ---");
            } else {
                System.out.println(mapa.get(S));
            }
        }
    }

    //<editor-fold defaultstate="collapsed" desc="Preenche valore do vetor">
    public static void preencheVetor(Map mapa) {
        String[] pais = {"brasil", "alemanha", "austria", "coreia", "espanha", "grecia",
            "estados-unidos", "inglaterra", "australia", "portugal", "suecia", "turquia",
            "argentina", "chile", "mexico", "antardida", "canada", "irlanda", "belgica",
            "italia", "libia", "siria", "marrocos", "japao"},
                frase = {
                    "Feliz Natal!", "Frohliche Weihnachten!", "Frohe Weihnacht!",
                    "Chuk Sung Tan!", "Feliz Navidad!", "Kala Christougena!", "Merry Christmas!",
                    "Merry Christmas!", "Merry Christmas!", "Feliz Natal!", "God Jul!", "Mutlu Noeller",
                    "Feliz Navidad!", "Feliz Navidad!", "Feliz Navidad!", "Merry Christmas!",
                    "Merry Christmas!", "Nollaig Shona Dhuit!", "Zalig Kerstfeest!", "Buon Natale!",
                    "Buon Natale!", "Milad Mubarak!", "Milad Mubarak!", "Merii Kurisumasu!"};
        
        for (int i = 0; i < frase.length; i++) {
            mapa.put(pais[i], frase[i]);
        }
    }
//</editor-fold>
}
