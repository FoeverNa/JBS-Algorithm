package silver.s4.q1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = true;
        }

        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());

        int total = 0;
        int p = 1;
        for (int i = 0; i < m; i++) {
            int v = Integer.parseInt(st.nextToken());
            total += minMove(arr, n, p, v);
            arr[v] = false;
            if (i < m - 1) {
                p = newP(arr, n, v);
            }
        }
        System.out.println(total);
    }


    private static int minMove(boolean[] arr, int n, int p, int v) {
        int left = 0;
        int right = 0;

        int leftP = p;
        while (v != leftP) {
            if (--leftP < 1) {
                leftP = n;
            }
            if (arr[leftP]) {
                left++;
            }
        }

        int rightP = p;
        while (v != rightP) {
            if (++rightP > n) {
                rightP = 1;
            }
            if (arr[rightP]) {
                right++;
            }
        }

        return Math.min(left, right);
    }

    private static int newP(boolean[] arr, int n, int v) {


        while (true) {
            if (++v > n) {
                v = 1;
            }
            if (arr[v]) {
                break;
            }
        }
        return v;
    }
}