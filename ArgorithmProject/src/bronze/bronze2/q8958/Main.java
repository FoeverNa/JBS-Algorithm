package bronze.bronze2.q8958;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testNum = Integer.parseInt(bf.readLine());

        int score;
        int preScore;

        for (int i = 0; i <testNum ; i++) {
            score = 0;
            preScore =0;
            char[] array = bf.readLine().toCharArray();
            for (int j = 0; j <array.length ; j++) {
                if(array[j] == 'O'){
                    score += ++preScore;
                } else {
                    preScore = 0;
                }
            }
            bw.write(String.valueOf(score+"\n"));
        }
        bw.flush();
        bw.close();;
    }
}