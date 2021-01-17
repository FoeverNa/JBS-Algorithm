package leveltest1.나누어떨어지숫자배열;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] arr1 = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3,2,6 };

        int divisor1 = 5;
        int divisor2 = 1;
        int divisor3 = 10;

        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(arr1, divisor1)));
        System.out.println(Arrays.toString(sol.solution(arr2, divisor2)));
        System.out.println(Arrays.toString(sol.solution(arr3, divisor3)));
    }
}

