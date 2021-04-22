package silver.s4.q10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[20000001];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n ; i++) {
            int v = Integer.parseInt(st.nextToken());
            arr[v+10000000]++;
        }

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m ; i++) {
            int v = Integer.parseInt(st.nextToken());
            sb.append(arr[v+10000000]).append(" ");
        }
        System.out.println(sb);
    }
}