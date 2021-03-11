package bronze.bronze5to3.q1712;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fCost = sc.nextInt();
        int vCost = sc.nextInt();
        int pricePerProduct = sc.nextInt();
        int priceWithoutVCost = pricePerProduct - vCost;
        int output = 0;

        if (priceWithoutVCost <= 0 ) {
            output = -1;
        } else {
            output = (fCost / priceWithoutVCost) +1;
        }

        System.out.println(output);
    }
}