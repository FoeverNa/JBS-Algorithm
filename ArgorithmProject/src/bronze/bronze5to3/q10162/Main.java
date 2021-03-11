package bronze.bronze5to3.q10162;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int[] buttons = {300, 60, 10};
        int[] clickNum = new int[3];

        for (int i = 0; i < buttons.length; i++) {
            clickNum[i] = time / buttons[i];
            time = time % buttons[i];
        }

        if (time != 0) {
            System.out.print(-1);
        } else {
            for (int integer : clickNum) {
                System.out.print(integer + " ");
            }
        }
    }
}
