package silver.s5.q2609;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);

        int max = 0;
        for(int i =1;  i <= smaller; i++) {
            if (a % i == 0 && b % i ==0) {
                max = i;
            }
        }

        int min = 0;
        here:
        for(int i = 1; true; i++ ){
            for(int j = 1; true; j++) {
                if (bigger * i == smaller * j) {
                    min = bigger * i;
                    break here;
                } else if( bigger * i < smaller *j) {
                    break;
                }
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}