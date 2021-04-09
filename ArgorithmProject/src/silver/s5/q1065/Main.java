package silver.s5.q1065;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        if(n == 1000) {
            n -= 1;
        }

        int count = 0;
        int num;
        int first;
        int second;
        int third;
        for (int i = 1; i <= n; i++) {
            num = i;
            if(num / 100 == 0 || num / 10 ==0) {
                count++;
            } else {
                first = num / 100;
                second = (num % 100) / 10;
                third = (num % 10);
               if(first - second == second - third) {
                   count++;
               }
            }
        }
        System.out.println(count);
    }
}