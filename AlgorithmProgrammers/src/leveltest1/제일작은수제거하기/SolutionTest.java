package leveltest1.제일작은수제거하기;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {10};

        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(arr1)));
        System.out.println(Arrays.toString(sol.solution(arr2)));
    }
}

