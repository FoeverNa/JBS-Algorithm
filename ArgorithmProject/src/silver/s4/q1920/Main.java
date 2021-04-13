package silver.s4.q1920;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m ; i++) {
            int val = Integer.parseInt(st.nextToken());
            sb.append(bs(arr, val)).append("\n");
        }
        System.out.println(sb);
    }
    private static int bs(int[] arr, int val) {
        int first = 0;
        int last = arr.length-1;
        int mid = 0;

        while(first <= last) {
            mid = (first + last) / 2;
            if(val == arr[mid]) {
                return 1;
            }
            if(val > arr[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return 0;
    }
}
