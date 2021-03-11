package bronze.bronze2.q11720;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numbers = sc.next();
        char[] chars = numbers.toCharArray();
        int answer = 0;
        for (char c : chars) {
            answer += Character.getNumericValue(c);
        }
        System.out.println(answer);
    }
}