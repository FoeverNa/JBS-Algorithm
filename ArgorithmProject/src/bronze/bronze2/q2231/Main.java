package bronze.bronze2.q2231;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        // N을 입력받는다
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int constructor = 0;
        // 1부터 N-1까지 생성자를 구해본다
        for (int i = 1; i < N; i++) {
            if( op(i) == N ) {
                constructor = i;
                break;
            }
        }

        //생성자를 출력한다. 없으면 0이 출력된다
        System.out.println(constructor);
    }

    // 생성자를 구하는 메소드
    private static int op(int i) {
        String s = String.valueOf(i);
        int sum = i;
        for (int j = 0; j < s.length() ; j++) {
            sum += Character.getNumericValue(s.charAt(j));
        }
        return sum;
    }
}
