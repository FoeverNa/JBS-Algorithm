package bronze.bronze5to3.q2438;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <number ; i++) {
            System.out.println(sb.append("*"));
        }
    }
}
