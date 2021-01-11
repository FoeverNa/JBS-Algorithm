package leveltest1.모의고사;


import java.util.Arrays;
import java.util.Collections;

public class SolutionTest {
    public static void main(String[] args) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {1,3,2,4,2};
        int[] answer3 = {6,6,6,6,2};
        int[] answer4 = {6,6,6,6,6};


        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(answer1)));
        System.out.println(Arrays.toString(sol.solution(answer2)));
        System.out.println(Arrays.toString(sol.solution(answer3)));
        System.out.println(Arrays.toString(sol.solution(answer4)));




    }
}

