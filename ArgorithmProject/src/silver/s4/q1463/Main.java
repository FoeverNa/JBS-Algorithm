package silver.s4.q1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            arr[i] = cal(arr, i);
        }

        System.out.println(arr[n]);
    }

    static int cal(int[] arr, int i) {

        int count = 0;
        int num = i;
        while (num >= 3) {
            if (num % 3 == 0) {
                num /= 3;
            }else if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }
        if (num == 2) {
            count++;
        }

        if (i % 3 == 0) {
            count = Math.min(count, arr[i / 3] + 1);
        }
        if (i % 2 == 0) {
            count = Math.min(count, arr[i / 2] + 1);
        }
        if(i > 1) {
            count = Math.min(count, arr[i - 1] + 1);
        }
        return count;
    }
}
