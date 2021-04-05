package silver.s5.q1476;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // E,S,M을 각각 입력받는다
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 연도를 계산할 변수 선언
        int year = 0;


        while(true) {
            year++;
            if ((year-E) % 15 == 0 && (year-S) % 28 == 0  && (year-M) % 19 ==0 ) {
                break;
            }
        }
        // 더 횟수를 출력한다
        System.out.println(year);
    }
}