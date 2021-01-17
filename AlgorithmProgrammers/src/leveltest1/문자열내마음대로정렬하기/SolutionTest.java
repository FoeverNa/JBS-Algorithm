package leveltest1.문자열내마음대로정렬하기;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        String[] strings1= {"sun", "bed", "car"};
        String[] strings2= {"abce", "abcd", "cdx"};
        String[] strings3= {"xcvdebf", "wersdbf", "sdvzvbf"};
        String[] strings4= {"a", "z", "e"};
        String[] strings5= {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
        String[] strings6= {"cbcda","bbcdb","abcdc"};

        int n1 = 1;
        int n2 = 2;
        int n3 = 5;
        int n4 = 0;
        int n5 = 0;
        int n6 = 3;

        Solution sol = new Solution();


        System.out.println(Arrays.toString(sol.solution(strings1, n1)));
        System.out.println(Arrays.toString(sol.solution(strings2, n2)));
        System.out.println(Arrays.toString(sol.solution(strings3, n3)));
        System.out.println(Arrays.toString(sol.solution(strings4, n4)));
        System.out.println(Arrays.toString(sol.solution(strings5, n5)));
        System.out.println(Arrays.toString(sol.solution(strings6, n6)));
    }
}

