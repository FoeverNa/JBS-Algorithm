package silver.s4.q10773;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());

        Stack<Integer> stack = new Stack<>();

        int sum = 0;
        for (int i = 0; i < k ; i++) {
            int num = Integer.parseInt(bf.readLine());
            if (num > 0) {
                sum+= num;
                stack.add(num);
            } else {
                sum -= stack.pop();
            }
        }
        System.out.println(sum);
    }
}
