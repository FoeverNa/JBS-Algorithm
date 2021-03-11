package bronze.bronze5to3.q2442;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}