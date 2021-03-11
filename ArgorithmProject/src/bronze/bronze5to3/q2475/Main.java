package bronze.bronze5to3.q2475;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            a = sc.nextInt();
            sum += Math.pow(a, 2);
        }

        System.out.println(sum % 10);
    }
}