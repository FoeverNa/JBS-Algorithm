package silver.s4.q1026;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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

        quickSort(a);
        quickSort(b);

        int s = 0;
        for (int i = 0; i < n; i++) {
            s += a[i] * b[(n - 1) - i];
        }
        System.out.println(s);
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int start, int end) {

        int part = partition(arr, start, end);

        if(start < part - 1) {
            quickSort(arr, start, part-1);
        }
        if(part < end) {
            quickSort(arr, part, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while(start <= end ) {

            while (arr[start] < pivot  ) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
