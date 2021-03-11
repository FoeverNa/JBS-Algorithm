package bronze.bronze5to3.q1550;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String hexadecimal;
        hexadecimal = sc.nextLine();
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println(decimal);
    }
}