package bronze.bronze1.q9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
           while(st.hasMoreTokens()) {
               StringBuilder tsb = new StringBuilder(st.nextToken());
               sb.append(tsb.reverse() + " ");
           }
           sb.append("\n");
        }
    }
}