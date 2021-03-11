package bronze.q10250;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int f = 0; f < t ; f++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int x ,y;
            if(n % h == 0) {
                x = h*100;
                y = n/h;
            } else {
                x = (n%h)*100;
                y = (n/h)+1;
            }

            System.out.println(x + y);
        }
    }
}