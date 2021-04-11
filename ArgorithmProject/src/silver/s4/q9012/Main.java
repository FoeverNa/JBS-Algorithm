package silver.s4.q9012;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        int left, right;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String s = bf.readLine();
            left = 0;
            right = 0;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    left++;
                } else {
                    right++;
                }
                if (right > left) {
                    break;
                }
            }
            if (left == right) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}