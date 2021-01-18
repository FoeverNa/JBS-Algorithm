package leveltest1.문자열내p와y의개수;

public class SolutionTest {
    public static void main(String[] args) {
        String s1 = "pPoooyY";
        String s2 = "Pyy";
        String s3 = "OOooeeEE";

        OtherSolution sol = new OtherSolution();

        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));
    }
}

