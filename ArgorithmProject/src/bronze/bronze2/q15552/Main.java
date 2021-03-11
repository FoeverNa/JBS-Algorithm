package bronze.bronze2.q15552;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testNum = Integer.parseInt(bf.readLine());

        for (int i = 0; i <testNum ; i++) {
            st = new StringTokenizer(bf.readLine());
            int value =  Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(value) + "\n");
        }
        bw.flush();
        bw.close();;
    }
}