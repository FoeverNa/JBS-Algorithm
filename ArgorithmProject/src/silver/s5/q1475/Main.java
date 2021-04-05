package silver.s5.q1475;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[10];

        // n에서 숫자하 하나씩 빼서 배열에 index에 ++해준다
        while( n>0) {
            int r = n %10;
            arr[r]++;
            n /= 10;
        }

        // 6과 9는 혼용해서 사용할 수 있는 것을 처리해준다
        arr[9] = ((arr[6] + arr[9])/2) + ((arr[6] + arr[9])%2);
        arr[6] = 0;

        //배열의 최대값을 구하기위해 변수 선언
        //n은 0 ~ 1000000이기 때문에 max의 최소값은 1이다
        int max = 1;
        for(int i = 0; i < 10; i++ ) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}