package silver.s4.q9012;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack;
        for (int i = 0; i < t; i++) {
            String s = bf.readLine();
            stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    stack.push('(');
                } else {
                    if (stack.empty()) {
                        stack.push('(');
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.empty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}