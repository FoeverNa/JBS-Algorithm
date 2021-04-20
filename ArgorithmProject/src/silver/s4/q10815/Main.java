package silver.s4.q10815;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sort(arr);

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int val = Integer.parseInt(st.nextToken());
            int result = bs(arr, val);
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }

    private static int bs(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == num) {
                return 1;
            } else {
                if (arr[mid] > num) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }


        return 0;
    }

    private static void sort(int[] arr) {
        int[] tmp = new int[arr.length];
        sort(arr, tmp, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, tmp, start, mid);
            sort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }
        int part1 = start;
        int part2 = mid + 1;
        int index = start;
        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = tmp[part1 + i];
        }
    }
}