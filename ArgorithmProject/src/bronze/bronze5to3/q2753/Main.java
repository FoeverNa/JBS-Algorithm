package bronze.bronze5to3.q2753;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        int lunarYear = 0;

        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            lunarYear = 1;
        }
        System.out.println(lunarYear);
    }
}