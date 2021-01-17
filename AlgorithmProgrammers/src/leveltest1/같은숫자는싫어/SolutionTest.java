package leveltest1.같은숫자는싫어;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {

        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(arr1)));
        System.out.println(Arrays.toString(sol.solution(arr2)));
    }
}

