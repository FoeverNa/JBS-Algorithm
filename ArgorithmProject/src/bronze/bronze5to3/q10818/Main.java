package bronze.bronze5to3.q10818;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array= new int[n];

        for (int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[1];
        int max = array[1];

        for(int integer : array) {
            if (integer >= max) {
                max = integer;
            } else if (integer < min) {
                min = integer;  
            }
        }
        System.out.println(min + " " + max);
    }
}
