package silver.s4.q1978;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        boolean[] arr = new boolean[1001];
        for (int i = 0; i < n ; i++) {
            int val = Integer.parseInt(st.nextToken());
            arr[val] = true;
        }
        int result = che(arr);
        System.out.println(result);
    }

    private static int che(boolean[] arr) {
        int count = 0;

        for (int i = 2; i <=1000 ; i++) {
            if(arr[i]) {
                count++;
            }
            for (int j = 2; j <= 500 ; j++) {
                if(i*j >1000) {
                    break;
                }
                arr[i*j] = false;
            }
        }
        return count;
    }
}