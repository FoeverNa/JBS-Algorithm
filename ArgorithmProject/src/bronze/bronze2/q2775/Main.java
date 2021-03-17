package bronze.bronze2.q2775;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(bf.readLine());

        int k,n;

        // 0층은 변하지 않는 배열임으로 따로 선언해준다
        int[] ground = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] before;
        int[] now = new int[14];

        // 테스트 갯수만큼 돌려주는역할
        for (int i = 0; i < testNum ; i++) {
            k = Integer.parseInt(bf.readLine());
            n = Integer.parseInt(bf.readLine());
            //0층이 항상 먼저올 수 있도록 먼저 배열을 복사한다
            java.lang.System.arraycopy(ground, 0,now,0,14);
            //층수나타내는 for문
            for (int j = 0; j < k ; j++) {
                before = now;
                now = new int[14];
                // 호수 나타내는 for문
                for (int l = 0; l < n  ; l++) {
                    if (l == 0) {
                        now[0] = 1;
                    }else {
                        now[l] = now[l-1] + before[l];
                    }
                }
            }
            //마지막 배열에 n호 실 위치에 값을 출력한다
            System.out.println(now[n-1]);
        }
    }
}
