package leveltest1.두정수사이의합;

public class SolutionTest {
    public static void main(String[] args) {
        int a1 = 3;
        int a2 = 3;
        int a3 = 5;

        int b1 = 5;
        int b2 = 3;
        int b3 = 3;

        Solution sol = new Solution();

        System.out.println(sol.solution(a1, b1));
        System.out.println(sol.solution(a2, b2));
        System.out.println(sol.solution(a3, b3));
    }
}

