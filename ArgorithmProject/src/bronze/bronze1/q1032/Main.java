package bronze.bronze1.q1032;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        char[] answer = bf.readLine().toCharArray();

        for (int i = 0; i < t-1 ; i++) {
            String compare =  bf.readLine();
            for (int j = 0; j <compare.length() ; j++) {
                if (answer[j] != compare.charAt(j)) {
                    answer[j] = '?';
                }
            }
        }
        System.out.println(String.valueOf(answer));
    }
}