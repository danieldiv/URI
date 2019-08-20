package string;

import java.io.IOException;
import java.util.Scanner;

public class Huaauhahhuahau {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
            
        String str, res, regex = "[^aeiou]";
        
        str = sc.next();
        
        str = str.replaceAll(regex, "");
        res = new StringBuffer(str).reverse().toString();
        
        System.out.println((str.equals(res)) ? "S" : "N");
    }
}
