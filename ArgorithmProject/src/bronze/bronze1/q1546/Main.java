package bronze.bronze1.q1546;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        
        int testNum = Integer.parseInt(bf.readLine());//과목 갯수
        st = new StringTokenizer(bf.readLine());

        int max = 0;
        double sum = 0; // 실수로 나누기 값을 받기위해 sum을 double형으로 선언
        int score = 0;
        for (int i = 0; i < testNum; i++) {  // 최대값과 전체 점수의 합계구함
           score = Integer.parseInt(st.nextToken()) ;
           sum += score;
           if (score > max) {
               max = score;
           }
        }
        
        System.out.println((sum/max) *100 / testNum);
    }
}