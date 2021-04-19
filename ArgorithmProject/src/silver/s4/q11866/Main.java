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

        for(int i = 0; i < n; i++) {
            int count = 0;
            while(count < k) {
                index++;
                if (index > n) {
                    index = 1;
                }
                if(arr[index]) {
                    count++;
                }
            }
            sb.append(index).append(", ");
            arr[index] = false;
        }
        sb.replace(sb.length()-2, sb.length()-1, ">");
        System.out.println(sb);
    }
}