package leveltest1.예산;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] d1 = {1,3,2,4,5};
        int[] d2 = {2,2,3,3};
        int[] d3 = {5,3,4,2,1};


        int budget1 = 9;
        int budget2 = 10;
        int budget3 = 500;



        Solution sol = new Solution();

        System.out.println(sol.solution(d1, budget1));
        System.out.println(sol.solution(d2, budget2));
        System.out.println(sol.solution(d3, budget3));


    }
}


