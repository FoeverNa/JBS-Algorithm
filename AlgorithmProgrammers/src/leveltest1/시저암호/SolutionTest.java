package leveltest1.시저암호;

public class SolutionTest {
    public static void main(String[] args) {

        String s1 = "AB";
        String s2 = "z";
        String s3 = "a B z";
        String s4 = "AaZz";


        int n1 = 1;
        int n2 = 1;
        int n3 = 4;
        int n4 = 25;

        Solution sol = new Solution();

        System.out.println(sol.solution(s1, n1));
        System.out.println(sol.solution(s2, n2));
        System.out.println(sol.solution(s3, n3));
        System.out.println(sol.solution(s4, n4));

    }
}

