package silver.s5.q2581;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if(sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else{
            System.out.println(-1);
        }
    }
}