package silver.s4.q2108;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(Math.round(sum / n)).append("\n");
        sb.append(arr[(n - 1) / 2]).append("\n");
        sb.append(findMany(arr)).append("\n");
        sb.append(arr[n - 1] - arr[0]);
        System.out.println(sb);
    }

    private static int findMany(int[] arr) {
        int count = 1;
        int beforeCount = 0;
        int manyNum = arr[0];
        boolean isSecond = false;
        int beforeNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == beforeNum) {
                count++;
            } else {
                if (count > beforeCount) {
                    manyNum = arr[i - 1];
                    beforeCount = count;
                    isSecond = false;
                } else if (count == beforeCount && !isSecond) {
                    manyNum = arr[i - 1];
                    isSecond = true;
                }
                count = 1;
                beforeNum = arr[i];
            }
        }
        if (count > beforeCount || count == beforeCount && !isSecond) {
            manyNum = arr[arr.length-1];
        }

        return manyNum;
    }
}