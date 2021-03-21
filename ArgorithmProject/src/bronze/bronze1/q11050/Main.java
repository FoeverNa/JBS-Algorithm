package bronze.bronze1.q11050;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args ) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = fact(n) / (fact(k)* fact(n-k));
        System.out.println(answer);
    }

    private static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fact(n-1)*n;
        }

    }
}