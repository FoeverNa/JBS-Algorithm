package leveltest1.k번째수;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] array1 = {1,5,2,6,3,7,4};
        int[][] commands1 = {{2,5,3},{4,4,1},{1,7,3}};


        Solution sol = new Solution();


        System.out.println(Arrays.toString(sol.solution(array1, commands1)));
    }
}

