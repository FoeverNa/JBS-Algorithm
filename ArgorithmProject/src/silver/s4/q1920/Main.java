package silver.s4.q1920;

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
        int min = arr[0];
        int max = arr[arr.length-1];

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int result;
        for (int i = 0; i < m ; i++) {
            int val = Integer.parseInt(st.nextToken());
            result =0;
            if(val >= min || val <= max) {
                for (int j = 0; j < arr.length ; j++) {
                    if( val < arr[j]) {
                        break;
                    }else if(val == arr[j]) {
                        result=1;
                        break;
                    }
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
