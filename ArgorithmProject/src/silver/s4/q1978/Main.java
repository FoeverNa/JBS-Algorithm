package silver.s4.q1978;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {

    static  int max = 1000;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        boolean[] arr = new boolean[max+1];

        che(arr);

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count =0;
        for (int i = 0; i < n ; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (!arr[val]) {
                count ++;
            }
        }
        System.out.println(count);

    }

    private static void che(boolean[] arr) {
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= Math.sqrt(max) ; i++) {
            if(arr[i]) {
                continue;
            }
            for (int j = i*i; j <= max; j+=i) {
                arr[j] =true;
            }
        }
    }
}