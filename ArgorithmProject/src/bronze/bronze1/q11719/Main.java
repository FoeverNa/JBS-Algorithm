package bronze.bronze1.q11719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; true; i++) {
            String s = bf.readLine();
            if (s == null){
                break;
            }
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}