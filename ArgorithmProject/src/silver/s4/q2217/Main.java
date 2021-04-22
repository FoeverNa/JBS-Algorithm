package silver.s4.q2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        int maxWeight = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            int weight = arr[i] * (n-i);
            if (weight >= maxWeight) {
                maxWeight = weight;
            }
        }
        System.out.println(maxWeight);
    }
}