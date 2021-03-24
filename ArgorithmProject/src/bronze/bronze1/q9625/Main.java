package bronze.bronze1.q9625;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        String s = "A";
        StringBuilder sb = new StringBuilder();

        int countA = 1;
        int countB = 0;

        for(int i = 0; i < t ; i++) {
            sb.delete(0, sb.length());
            int temp = 0;
            temp = countA;
            countA = countB;
            countB += temp;

        }
        System.out.println(countA + " " + countB);
    }
}