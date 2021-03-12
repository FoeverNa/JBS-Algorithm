package bronze.bronze2.q10809;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        char a = 'a';
        for (int i = 0; i <26 ; i++) {
            bw.write(s.indexOf(a++)+ " ");
        }
        bw.flush();
        bw.close();
    }
}