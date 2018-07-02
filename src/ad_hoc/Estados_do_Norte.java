package ad_hoc;

import java.io.IOException;
import java.util.Scanner;

public class Estados_do_Norte {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String estado, e_norte = "roraima,acre,amapa,amazonas,para,rondonia,tocantins";

        estado = sc.next();

        if (e_norte.contains(estado)) {
            System.out.println("Regiao Norte");
        } else {
            System.out.println("Outra regiao");
        }
    }
}
