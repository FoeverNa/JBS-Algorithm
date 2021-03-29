package silver.s5.q1185;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bf.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        // 큐를 선언하고 1~N까지 값 초기화
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            que.offer(i);
        }

        // 요세푸스 구하기
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        // 마지막 출력값을 다르게 주기 위해 size> 1만큼만 돌린다
        while(que.size() > 1) {
            //k-1번 큐에서 값을 꺼내 다시 넣는다
            for(int i = 0; i < k-1; i++) {
                Integer val = que.poll();
                que.offer(val);
            }
            //k번째 값을 꺼내서 출력한다
            Integer val = que.poll();
            sb.append(val).append(",").append(" ");
        }
        sb.append(que.poll()).append(">");

        System.out.println(sb);
    }
}