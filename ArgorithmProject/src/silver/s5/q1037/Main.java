package silver.s5.q1037;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //입력값중에 가장 큰값과 가장 작은 값을 구한다 -> 약수는 쌍을 이루기 때문
        for(int i = 0; i < t; i++) {
            int val = Integer.parseInt(st.nextToken());
            min = Math.min(val, min);
            max = Math.max(val, max);
        }

        //2약수의 값을 곱한 값이 N이 됨으로 곱해서 출력해준다
        long N = (long) min * max;
        System.out.println(N);
    }
}