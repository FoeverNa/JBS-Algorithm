package leveltest1.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class SolutionTest {
    public static void main(String[] args) {
        String s1 = "Zbcdefg";
        Solution sol = new Solution();

//        System.out.println(sol.solution(s1));

        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);

        System.out.println(new StringBuilder(new String(charArray)).reverse().toString());


    }
}

