package bronze.bronze5to3.q2445;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb;

        //첫번째
        for (int i = 0; i < n ; i++) {
            sb = new StringBuilder();
            //별 2,4,6,8,10개 추가
            for (int j = 0; j < 2*(i+1); j++) {
                sb.append("*");
            }
            //공백 8, 6, 5, 2, 0개 추가
            for (int j = 0; j < (2*n)-(2*(i+1)); j++) {
                // 1, 2, 3, 4 위치에 추가
                sb.insert(i+1, " ");
            }
            System.out.println(sb);
        }
        //두번째
        for (int i = n-1; i > 0; i--) {
            sb = new StringBuilder();
            //별 8, 6, 4, 2 추가
            for (int j = 0; j < (i)*2 ; j++) {
                sb.append("*");
            }
            //공백  2, 4 6 8 추가
            for (int j = 0; j < (n-i)*2; j++) {
                sb.insert(i, " ");
            }
            System.out.println(sb);
        }
    }
}