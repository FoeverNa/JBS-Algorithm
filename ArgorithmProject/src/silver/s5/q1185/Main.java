package silver.s5.q1185;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bf.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        // List로 1~N까지의 값 초기화
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            list.add(i);
        }

        // 요세푸스 구하기
        StringBuilder sb = new StringBuilder();
        int index = -1;
        sb.append("<");
        int val;
        while(n > 0) {
            index += k;
            //index가 n을 초과할때 0부터 시작할수있 도록
            if( index >= n) {
                index = index % n;
            }
            val = list.remove(index);
            sb.append(val);
            index--; n--;
            // 맨자미작에는 ,이 안들어가게 범위설정
            if (n > 0){
                sb.append(",").append(" ");
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}