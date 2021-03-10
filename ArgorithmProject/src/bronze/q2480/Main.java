package bronze.q2480;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        Set<Integer> set = new HashSet<>();
        int dNum = 0;
        int setSize = 0;
        for (int i = 0; i < array.length ; i++) {
            set.add(array[i]);
            if (setSize == set.size()){
                dNum = array[i];
            }
            setSize = set.size();
        }
        int answer = 0;
        if(setSize == 3) {
            answer = array[array.length-1] * 100;
        } else if (setSize == 2 ) {
            answer = 1000 + (dNum * 100);
        } else if (setSize == 1) {
            answer = 10000 + (dNum * 1000);
        }
        System.out.println(answer);
    }
}
