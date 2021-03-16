package bronze.bronze2.q2309;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 9명의 키를 배열로 만들고 합을 구함
        int[] heights = new int[9];
        int sum = 0;
        for (int i = 0; i <heights.length ; i++) {
            heights[i] = Integer.parseInt(bf.readLine());
            sum += heights[i];
        }
        // 9명의 키를 오름차순으로 정렬
        Arrays.sort(heights);

        // 완전탐색하여 2명의 키를 더해 9명의 키의 합산에서 뺀값이 100인 것을 찾아냄
        int[] except = new int[2];
        here:
        for (int i = 0; i < heights.length-1 ; i++) {
            for (int j = i+1; j < heights.length ; j++) {
                if(sum - (heights[i]+heights[j]) == 100) {
                        except[0] = i;
                        except[1] = j;
                        break here;
                }
            }
        }

        // 2명의 키를 제외한 나머지 키들을 순차적으로 출력함
        for (int i = 0; i <heights.length ; i++) {
            if (i == except[0] || i == except[1]) {
                continue;
            }
            bw.write(heights[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
