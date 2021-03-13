package bronze.bronze2.q2920;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int first = Integer.parseInt(st.nextToken());
        String answer = "mixed";

        here:
        if (first == 1) {
            for (int i = 0; i <7 ; i++) {
                int temp = Integer.parseInt(st.nextToken());
                if (++first != temp ) {
                    break here;
                }
            }
            answer = "ascending";

        } else if(first == 8) {
            for (int i = 0; i <7 ; i++) {
                int temp = Integer.parseInt(st.nextToken());
                if (--first != temp ) {
                    break here;
                }
            }
            answer = "descending";
        }
        System.out.println(answer);
    }
}
