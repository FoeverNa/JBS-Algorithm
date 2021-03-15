package bronze.bronze2.q10870;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int prePreNum = 0;
        int preNum = 1;

        for (int i = 0; i <n ; i++) {
            prePreNum = preNum;
            preNum = prePreNum + preNum;
        }
        System.out.println(prePreNum);
    }
}
