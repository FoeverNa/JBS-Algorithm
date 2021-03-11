package bronze.bronze5to3.q2444;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < (2 * n) - 1; i++) {
            if (i < n) {
                for (int j = n - 1; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (i * 2) + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < (i + 1) - n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < ((n * 2) - 1) - (((i + 1) - n) * 2); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}