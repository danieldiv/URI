package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Turmo_do_JB6 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String str, V[];

        //Os atributos dos monstros vao ser inteligencia, sabedoria... || dodo || pedra
        //Iron Maiden’s gonna get you, no matter how far! || leo || papel
        //Urano perdeu algo muito precioso... || peper || tesoura
        
        //Pedra ganha da tesoura
        //Tesoura ganha do papel
        //Papel ganha da pedra
        
        //papel pedra pedra - papel
        //papel tesoura papel - tesoura
        //pedra pedra papel - papel
        //papel papel pedra - papel 
        
        while ((str = in.readLine()) != null) {
            V = str.split(" ");

            if (V[0].equals("pedra") && V[1].equals("papel")) {

            }
        }

    }
}
