package silver.s5.q1934;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 숫자 입력
        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st;


        int a, b , d, gcf;

        // 테스트 수 만큼 최대공약수 구하기
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t; i++) {

            st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            //두수의 최대공약수 먼저 구함
            d = gcd(a,b);
            //최대공약수 이용해서 최대공배수 구하기
            gcf = a *b / d;
            sb.append(gcf).append("\n");
        }
        System.out.println(sb);
    }
    // 유클리드 호제법을 통해 최대공약수를 구함
    private static int gcd(int a, int b){

        while(b !=0) {
        int r = a % b;
        a = b;
        b = r;
        }
        return a;
    }
}
