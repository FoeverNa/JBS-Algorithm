package bronze.bronze5to3.q2752;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i <array.length ; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
