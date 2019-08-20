package finalizar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//ad-hoc
public class Set {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        Map<Integer, String> map = new HashMap<>();

        String valor, figura, input[];
        int N;

        N = Integer.parseInt(in.readLine());
        input = in.readLine().split(" ");
        
        System.out.println(N);
        System.out.println(Arrays.toString(input));
    }
}
