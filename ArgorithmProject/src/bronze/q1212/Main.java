package bronze.q1212;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        BigInteger bigInteger = new BigInteger(input, 8);
        System.out.println(bigInteger.toString(2));
    }
}
