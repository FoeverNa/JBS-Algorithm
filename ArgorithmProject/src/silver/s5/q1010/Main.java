package silver.s5.q1010;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    private static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            sb.append(combination(n, k)).append("\n");
        }
        System.out.println(sb);
    }

    private static int combination(int n, int k) {
        if(dp[n][k] != 0) {
            return dp[n][k];
        }
        if(n == k || k == 0) {
            return dp[n][k] = 1;
        }
        return dp[n][k] = combination(n-1, k-1) + combination(n-1, k);
    }
}