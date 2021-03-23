package bronze.bronze1.q10988;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(bf.readLine());

        int half = sb.length() /2;

        if (sb.substring(0, half).equals(sb.reverse().substring(0, half))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}