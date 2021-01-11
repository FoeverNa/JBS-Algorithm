package leveltest1.소수찾기;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int x1 = 10 ;
        int x2 = 5 ;
        int x3 = 2 ;
        int x4 = 1000000 ;
        Solution sol = new Solution();


        System.out.println(sol.solution(x1));
        System.out.println(sol.solution(x2));
        System.out.println(sol.solution(x3));
        System.out.println(sol.solution(x4));

        System.out.println("--------------------------------------------------");

//        int answer = 0;
//
//        boolean[] array = new boolean[x1+1];
//        for (int i = 2; i <= x1; i++) {
//            array[i] = true;
//        }
//
//        for (int i = 2; i <= x1 ; i++) {
//            if(array[i]) {
//                answer++;
//                System.out.println(i);
//                for (int j = 1; j*i <= x1 ; j++) {
//                    array[i*j] =false;
//                }
//            }
//
//        }

    }
}

