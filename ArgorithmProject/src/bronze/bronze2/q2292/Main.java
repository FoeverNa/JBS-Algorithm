package bronze.bronze2.q2292;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        int num = 1;
        
        while (n > num) {
            num += 6 * count;
            count++;
        }

        if(count==0) {
            count =1;
        }
        System.out.println(count);
    }
}
