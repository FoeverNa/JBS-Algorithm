package bronze.bronze1.q1110;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int original = Integer.parseInt(bf.readLine());

        int a =original;
        int count = 0;
        do {
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            count++;

        } while (original != a);
        System.out.println(count);
    }
}