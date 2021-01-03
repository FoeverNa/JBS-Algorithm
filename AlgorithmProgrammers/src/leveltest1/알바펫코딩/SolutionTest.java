package leveltest1.알바펫코딩;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        String s1 = "ABZ";
        String s2 = "z";
        String s3 = "a B z";
        String s4 = "Z z";

        int n1 = 1;
        int n2 = 1;
        int n3 = 4;
        int n4 = 5;

        Solution sol = new Solution();

        System.out.println(sol.solution(s1, n1));
        System.out.println(sol.solution(s2, n2));
        System.out.println(sol.solution(s3, n3));
        System.out.println(sol.solution(s4, n4));


        int A = 'A';
        int Z = 'Z';
        int a = 'a';
        int z = 'z';
        System.out.println(A);
        System.out.println(Z);
        System.out.println(a);
        System.out.println(z);
        System.out.println((int)s1.toCharArray()[0]);
        System.out.println(Arrays.toString(s3.toCharArray()));

    }
}

