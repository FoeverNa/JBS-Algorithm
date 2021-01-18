package leveltest1.문자열내p와y의개수;

import java.util.Locale;

public class OtherSolution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length() ; i++) {

            if(s.charAt(i) == 'p'){
                count++;
            } else if (s.charAt(i) == 'y') {
                count--;
            }
        }

        return count == 0;
    }
}
