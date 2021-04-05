package silver.s5.q1037;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < t; i++) {
            int val = Integer.parseInt(st.nextToken());
            min = Math.min(val, min);
            max = Math.max(val, max);
        }

        long N = (long) min * max;
        System.out.println(N);
    }
}