package leveltest1.최대공약수최소공배;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 2;

        int m1 = 12;
        int m2 = 5;

        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(3, 12)));
        System.out.println(Arrays.toString(sol.solution(2, 5)));
    }
}

