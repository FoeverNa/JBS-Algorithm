package silver.s5.q11004;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSelect(arr);
        System.out.println(arr[k-1]);
    }

    private static void quickSelect(int[] arr) {
        quickSelect(arr, 0, arr.length-1);
    }

    private static void quickSelect(int[] arr, int start, int end) {

        if ( start >= end) {
            return;
        }

        int pt = partition(arr, start, end);
        if(pt+1 == k) {
            return;
        } else if (pt+1 > k) {
            quickSelect(arr, start, pt-1);
        } else if (pt+1 < k) {
            quickSelect(arr, pt+1, end);
        }

    }

    private static int partition(int[] arr, int start, int end) {

        int mid = (start + end) /2;
        swap(arr, start, mid);

        int pivot = arr[start];

        int i = start;
        int j = end;
        while(i < j) {
            while (pivot < arr[j]) j--;
            while (i < j && pivot >= arr[i]) i++;
            swap(arr, i, j);
        }
        arr[start] = arr[i];
        arr[i] = pivot;
        return i;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }
}