package leveltest1.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {
        int yNum = 0;
        int pNum = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i+1);
            if(str.equalsIgnoreCase("y")) {
                yNum++;
            } else if (str.equalsIgnoreCase("p")) {
                pNum++;
            }
        }

        if (yNum == pNum) {
            return true;
        }
        return false;

    }
}