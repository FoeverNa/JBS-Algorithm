package silver.s5.q7568;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        // arrays = 키와 신장을 저장할 배열 rank = 순위를 저장할 배열
        int[][] arrays = new int[t][3];
        int[] rank = new int[t];

        StringTokenizer st;

        // 배열 초기화
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
            rank[i] = 1;
            for(int j = 0; j < 2; j++) {
                arrays[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 완전탐색으로 값을 비교하여 키와신장이 둘다 큰경우 비교한 대상의 순위를 ++ 둘다 작은 경우 현재 비교하는 값에 ++
        for(int i = 0; i < t-1; i++) {
                int[] compare = arrays[i];
            for(int j = i+1; j < t; j++) {
                if (compare[0] > arrays[j][0] && compare[1] > arrays[j][1]) {
                    rank[j]++;
                } else if (compare[0] < arrays[j][0] && compare[1] < arrays[j][1]) {
                    rank[i]++;
                }
            }
        }

        // 순위를 위한 rank 배열을 출력
        StringBuilder sb = new StringBuilder();
        for(int val : rank) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }
}