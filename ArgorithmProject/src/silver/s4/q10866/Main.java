package silver.s4.q10866;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int top = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        arr = new int[n];

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String order = st.nextToken();
            int val = 0;
            if (st.hasMoreTokens()) {
                val = Integer.parseInt(st.nextToken());
            }
            Integer result = deque(order, val);
            if (result != null) {
                sb.append(result).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static Integer deque(String order, int val) {
        Integer r = null;

        switch (order) {
            case "push_front":
                if (top > 0) {
                    int[] temp = new int[arr.length];
                    for (int i = 0; i < top; i++) {
                        temp[i + 1] = arr[i];
                    }
                    arr = temp;
                }
                arr[0] = val;
                top++;
                break;
            case "push_back":
                arr[top] = val;
                top++;
                break;
            case "pop_front":
                if (top > 0) {
                    r = arr[0];
                    int[] temp = new int[arr.length];
                    for (int i = 1; i < top; i++) {
                        temp[i - 1] = arr[i];
                    }
                    arr = temp;
                    top--;
                } else {
                    r = -1;
                }
                break;
            case "pop_back":
                if (top > 0) {
                    r = arr[top - 1];
                    top--;
                } else {
                    r = -1;
                }
                break;
            case "size":
                r = top;
                break;
            case "empty":
                r = top > 0 ? 0 : 1;
                break;
            case "front":
                r = top > 0 ? arr[0] : -1;
                break;
            case"back":
                r = top > 0 ? arr[top-1] : -1;
        }

        return r;
    }
}
