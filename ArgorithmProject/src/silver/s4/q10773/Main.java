package silver.s4.q10773;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());

        int[] stack = new int[k];
        int top = 0;
        int sum = 0;
        for (int i = 0; i < k ; i++) {
            int num = Integer.parseInt(bf.readLine());
            if (num > 0) {
                sum+= num;
                stack[top] = num;
                top++;
            } else {
                sum -= stack[top-1];
                top--;
            }
        }
        System.out.println(sum);
    }
}
