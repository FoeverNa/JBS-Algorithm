package silver.s4.q10845;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int[] arr = new int[10000];
    static int front = 0;
    static int back = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String order;
        int num = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            order = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            Integer result = queue(order, num);
            if (result != null ) {
                sb.append(result).append("\n");
            }
        }
        System.out.println(sb);

    }

    private static Integer queue(String order, int num) {
        Integer val = null;

        switch(order) {
            case "push" :
                arr[back] = num;
                back++;
                break;
            case "pop" :
                if(front == back) {
                    val = -1;
                } else {
                    val = arr[front];
                    front++;
                }
                break;
            case "size" :
                val = back - front;
                break;
            case "empty" :
                val = front == back ? 1 : 0;
                break;
            case "front" :
                val = front == back ? -1 : arr[front];
                break;
            case "back" :
                val = front == back ? -1 : arr[back-1];
                break;
        }

        return val;
    }
}