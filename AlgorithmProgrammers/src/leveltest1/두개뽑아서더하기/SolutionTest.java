package leveltest1.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] numbers2 = {5, 0, 2, 7};

        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(numbers1)));
        System.out.println(Arrays.toString(sol.solution(numbers2)));
    }
}

