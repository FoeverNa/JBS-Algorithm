package silver.s5.q10989;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());
        int[] arr = new int[10001];

        for(int i = 0 ; i < t; i++) {
            int num = Integer.parseInt(bf.readLine());
            arr[num]++;
        }

        for(int i = 0; i < arr.length; i++ ) {
            for(int j = 0; j < arr[i]; j++) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}