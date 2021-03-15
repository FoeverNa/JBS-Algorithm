package bronze.bronze2.q1193;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bf.readLine());
        int a = 2;
        int b = 0;

        int order = 0;
        int count = 1;
        for (int i = 0; i < X; i++) {
            if (order == 0) {
                a--;
                b++;
                if (a == 0) {
                    a = 1;
                    b = ++count;
                    order = 1;
                }
            }else if (order ==1) {
                a++;
                b--;
                if (b == 0) {
                    b = 1;
                    a = ++count;
                    order =0;
                }
            }
        }
        System.out.println(a+"/"+b);
    }
}
