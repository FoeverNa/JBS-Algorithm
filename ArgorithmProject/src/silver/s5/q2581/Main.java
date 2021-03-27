package silver.s5.q2581;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        make_prime(n);

        int sum =0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i < prime.length ; i++) {
            if (!prime[i]) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else  {
            System.out.println(sum);
            System.out.println(min);
        }

    }

    private static void make_prime(int n) {

        prime = new boolean[n + 1];

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i]) {
                continue;
            }

            for(int j = i*i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }




    }
}