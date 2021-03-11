package bronze.bronze5to3.q2530;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        int time = sc.nextInt();

        hours  = (hours + ((minutes +((seconds+time)/60))/60)) % 24;
        minutes = (minutes + (((seconds+time)/60))) % 60;
        seconds = (seconds+time) % 60;

        System.out.println(hours + " " + minutes + " " + seconds);
    }
}
