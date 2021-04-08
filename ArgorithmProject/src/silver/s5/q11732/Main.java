package silver.s5.q11732;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    static boolean[] arr = new boolean[20];

    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        String order;
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
            order = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            int r = operation(order, num);
            if (r >= 0) {
                sb.append(r).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static int operation(String order, int num) {
        num = num - 1;
        int val = -1;
        switch(order) {
            case "add":
                if (!arr[num]) {
                    arr[num] = true;
                }
                break;
            case "remove":
                if (arr[num]) {
                    arr[num] = false;
                }
                break;
            case "check":
                val = arr[num] ? 1 : 0;
                break;
            case "toggle":
                arr[num] = !arr[num];
                break;
            case "all":
                Arrays.fill(arr, true);
                break;
            case "empty":
                Arrays.fill(arr, false);
                break;
        }
        return val;
    }
}

