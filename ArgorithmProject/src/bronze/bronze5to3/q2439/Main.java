package bronze.bronze5to3.q2439;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(" ");
        }
        for (int i = 0; i <number ; i++) {
            sb.delete(0,1);
            System.out.println(sb.append("*"));
        }
    }
}
