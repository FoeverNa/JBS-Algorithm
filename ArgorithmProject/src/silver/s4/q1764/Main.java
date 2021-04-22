package silver.s4.q1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] arr = new String[n+m];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = bf.readLine();
        }
        Arrays.sort(arr);

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i].equals(arr[i+1])) {
                sb.append(arr[i]).append("\n");
                count++; i++;
            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}