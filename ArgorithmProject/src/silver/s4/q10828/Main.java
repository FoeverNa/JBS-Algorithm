package silver.s4.q10828;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int[] stack = new int[10000];
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(java.lang.System.in));
        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        String o;
        int num = 0;
        Integer result;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <t ; i++) {
            st = new StringTokenizer(bf.readLine());
            o = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            result = operation(o, num);
            if(result != null ){
                sb.append(result).append("\n");
            }
        }
        java.lang.System.out.println(sb);
    }

    private static Integer operation(String o, int num) {
        Integer val = null;
        switch(o) {
            case "push":
                stack[size] = num;
                size++;
                break;
            case "pop":
                if(size > 0) {
                    val = stack[size-1];
                    stack[size-1] =0;
                    size--;
                } else {
                    val = -1;
                }
                break;
            case "size":
                val = size;
                break;
            case "empty":
                val = size > 0 ? 0 : 1;
                break;
            case "top":
                val = size > 0 ? stack[size-1] : -1;
                break;
        }
        return val;
    }
}