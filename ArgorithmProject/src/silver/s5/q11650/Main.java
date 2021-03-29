package silver.s5.q11650;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main  {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        int[][] arrays = new int[t][2];

        StringTokenizer st;

        // 입력값 초기화
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < 2; j++) {
                arrays[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // Comparator 재정의
        Arrays.sort(arrays, (a1, a2) -> {
            if(a1[0] == a2[0]) {
                return a1[1] - a2[1];
            } else {
                return a1[0] - a2[0];
            }
        });

        //정렬된 배열 순서대로 출력
        StringBuilder sb = new StringBuilder();
        for(int[] array : arrays) {
            sb.append(array[0]).append(" ").append(array[1]).append("\n");
        }
        System.out.println(sb);
    }
}
