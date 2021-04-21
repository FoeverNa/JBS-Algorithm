package silver.s4.q2164;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        if (n == 1) {
            System.out.println(1);
        } else {
            int[] arr = new int[(2 * n) + 1];

            for (int i = 1; i <= n; i++) {
                arr[i] = i;
            }
            int index = 1;
            int size = n;
            int top = n + 1;

            while (true) {
                index++; size--;
                int val = arr[index];
                if (size > 1) {
                    arr[top] = val;
                    top++;
                    index++;
                } else {
                    System.out.println(val);
                    break;
                }
            }
        }
    }
}