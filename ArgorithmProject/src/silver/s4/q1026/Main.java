package silver.s4.q1026;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer stA = new StringTokenizer(bf.readLine());
        StringTokenizer stB = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stA.nextToken());
            b[i] = Integer.parseInt(stB.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += a[i] * b[(n-1)-i];
        }
        System.out.println(s);
    }
}