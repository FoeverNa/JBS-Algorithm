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

        // 숫자를 증가시킬 int 변수들을 선언한다
        int a = 0;
        int b = 0;
        int c = 0;
        
        
        // 각숫자에 1을 증가시키고 E S M 과 각각 비교해서 같은지 확인한다
            // 각 숫자에 범위를 넘어가면 1을 대입시킨다
        int count = 0;
        while(true) {
            a++;b++;c++;
            if (a > 15) {
                a = 1;
            }
            if(b > 28) {
                b = 1;
            }
            if(c > 19) {
                c = 1;
            }
            count++;
            if (a == E && b == S && c == M) {
                break;
            }
        }
        // 더 횟수를 출력한다
        System.out.println(count);
    }
}