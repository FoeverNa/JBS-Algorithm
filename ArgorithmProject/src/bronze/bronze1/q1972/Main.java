package bronze.bronze1.q1972;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        int sum = 0;
        int min = 0;
        for (int i = 1; true ; i++) {
            int pow = i*i;
            if (pow >= m & pow<= n) {
                sum += pow;
                if(min == 0) {
                    min = pow;
                }
            } else if(pow > n) {
                break;
            }
        }

        if (sum>0) {
            System.out.println(sum);
            System.out.println(min);
        } else{
            System.out.println("-1");
        }
    }
}