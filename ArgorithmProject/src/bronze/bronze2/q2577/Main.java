package bronze.bronze2.q2577;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        char[] array = String.valueOf( a * b * c).toCharArray();
        int[] answer = new int[10];

        for (char ch : array) {
            answer[Character.getNumericValue(ch)]++;
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }
}