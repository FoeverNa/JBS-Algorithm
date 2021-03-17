package bronze.bronze2.q1075;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int F = Integer.parseInt(bf.readLine());

        N = N  - (N%100);
        String answer;

        if (N % F >0) {
            answer = String.valueOf(N+(F - (N %F)));
        } else {
            answer = String.valueOf(N);
        }

        System.out.println(answer.substring(answer.length()-2));
    }
}
