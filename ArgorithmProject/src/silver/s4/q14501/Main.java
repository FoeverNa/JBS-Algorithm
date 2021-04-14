package silver.s4.q14501;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] time = new int[n+1];
        int[] pay = new int[n+1];
        int[] dp = new int[n+2];

        StringTokenizer st;

        for(int i = 1; i <= n ; i++) {
            st = new StringTokenizer(bf.readLine());
            time[i] =  Integer.parseInt(st.nextToken());
            pay[i] =  Integer.parseInt(st.nextToken());
        }

        for(int i = n; i > 0; i--) {
            int index = i + time[i];

            if(index > n+1) {
                dp[i]=dp[i+1];
            } else {
                dp[i] = Math.max(dp[i+1], pay[i]+dp[index]);
            }
            System.out.println(dp[i]);
        }
        System.out.println(dp[1]);
    }
}