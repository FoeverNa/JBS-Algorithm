package silver.s5.q1094;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bf.readLine());

        int bar = 64;
        int sum = 64;
        int num = 1;

        if (X == bar) {
            System.out.println(1);
        } else {
            while(true) {
                bar /= 2;
                sum -= bar;
                if (X == sum) {
                    break;
                } else if (X > sum) {
                    sum += bar;
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}