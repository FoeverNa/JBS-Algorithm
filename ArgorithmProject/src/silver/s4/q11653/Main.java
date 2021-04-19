package silver.s4.q11653;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int i = 2;
        StringBuilder sb = new StringBuilder();
        while(i <= n) {
            if ( n % i == 0) {
                sb.append(i).append("\n");
                n /= i;
            } else {
                i++;
            }
        }
        System.out.println(sb);
    }
}