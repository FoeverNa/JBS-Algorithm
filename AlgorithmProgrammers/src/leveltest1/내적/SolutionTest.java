package leveltest1.내적;

public class SolutionTest {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4};
        int[] a2 = {-1,0,1};
        int[] b1 = {-3,-1,0,2};
        int[] b2 = {1,0,-1};


        Solution sol = new Solution();

        System.out.println(sol.solution(a1, b1));
        System.out.println(sol.solution(a2, b2));
    }
}

