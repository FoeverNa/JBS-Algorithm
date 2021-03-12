package bronze.bronze2.q2675;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testNum = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testNum ; i++) {
            st = new StringTokenizer(bf.readLine());
            int rotation = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j <str.length() ; j++) {
                for (int k = 0; k < rotation; k++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}