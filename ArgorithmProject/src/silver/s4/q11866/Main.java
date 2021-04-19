package silver.s4.q11866;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[n+1];

        for (int i = 1; i <= n ; i++) {
            arr[i] = true;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int index = 0;
        int count = 0;
        while (count < n) {
            int num = 0;
            while(num < k) {
                index++;
                if (index > n) {
                    index = 1;
                }
                if(arr[index]) {
                    num++;
                }
            }
            sb.append(index).append(", ");
            arr[index] = false;
            count++;
        }
        sb.replace(sb.length()-2, sb.length()-1, ">");
        System.out.println(sb);
    }
}