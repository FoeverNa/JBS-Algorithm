package bronze.bronze2.q2798;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bf.readLine();
        // 첫째줄에서 N과 M을 추출
        StringTokenizer st = new StringTokenizer(s1);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 둘째줄에서 카드들의 숫자를 int[]로 만들기
        String s2 = bf.readLine();
        st = new StringTokenizer(s2);

        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 카드들을 차례대로 더해서 M과 가까운 수를 찾아낸다
        int sum = 0;
        int answer = 0;
        here:
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if (answer < sum && sum <=M) {
                        answer = sum;
                    }
                    if (answer == M) {
                        break here;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
