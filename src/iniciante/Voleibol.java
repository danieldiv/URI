package iniciante;

import java.util.Scanner;

public class Voleibol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n, s, b, a, s1, b1, a1;
        float sq = 0, bq = 0, atk = 0;
        float sq1 = 0, bq1 = 0, atk1 = 0;
        float rS, rB, rA;
        
        String str;
        
        n = sc.nextShort();
        
        for (int i = 0; i < n; i++) {
            str = sc.next();
            
            while((s = sc.nextFloat()) < 0 || s > 10000){}
            while((b = sc.nextFloat()) < 0 || b > 10000){}
            while((a = sc.nextFloat()) < 0 || a > 10000){}
            
            while((s1 = sc.nextFloat()) < 0 || s1 > s){}
            while((b1 = sc.nextFloat()) < 0 || b1 > b){}
            while((a1 = sc.nextFloat()) < 0 || a1 > a){}
            
            sq += s;
            bq += b;
            atk += a;
            
            sq1 += s1;
            bq1 += b1;
            atk1 += a1;
        }
        
        rS = (sq1 * 100) / sq;
        rA = (atk1 * 100) / atk;
        rB = (bq1 * 100) / bq;
        
        System.out.printf("Pontos de Saque: %.2f %%.", rS);
        System.out.println();
        
        System.out.printf("Pontos de Bloqueio: %.2f %%.", rB);
        System.out.println();
        
        System.out.printf("Pontos de Ataque: %.2f %%.", rA);
        System.out.println();
        
    }
}
