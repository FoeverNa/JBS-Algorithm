package bronze.bronze2.q5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int ret = 1000 - Integer.parseInt(bf.readLine());
        int[] coins = {500, 100, 50, 10, 5, 1};

        int answer = 0;

        for (int i = 0; i <coins.length ; i++) {
            if (ret / coins[i] > 0) {
                answer += ret / coins[i];
                ret = ret % coins[i];
            }
        }

        System.out.println(answer);
    }
}