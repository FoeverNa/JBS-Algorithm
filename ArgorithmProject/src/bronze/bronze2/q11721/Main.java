package bronze.bronze2.q11721;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = bf.readLine();
        int r = s.length() / 10;

        for (int i = 0; i < r; i++) {
            int postion = (10 * i);
            sb.append(s.substring(postion, postion + 10) + "\n");
        }
        sb.append(s.substring(r * 10));

        System.out.println(sb);
    }
}
