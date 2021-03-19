package bronze.bronze1.q4673;

import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int C = Integer.parseInt(bf.readLine());
        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        for (int i = 0; i <C ; i++) {
            st = new StringTokenizer(bf.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            int sum = 0;
            int[] scores = new int[studentNum];
            for (int j = 0; j <studentNum ; j++) {
                int score = Integer.parseInt(st.nextToken());
                sum += score;
                scores[j] = score;
            }
            int average = sum / studentNum;
            double overAverage = 0;
            for (int j = 0; j < scores.length; j++) {
                if(scores[j]>average) {
                    overAverage++;
                }
            }
            double roundPercentage = Math.round( (overAverage/ studentNum *100) *1000)/1000.0;
            System.out.println(decimalFormat.format(roundPercentage) + "%");
        }

    }
}