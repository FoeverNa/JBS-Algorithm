package leveltest1.문자열다루기기본;

class Solution {
    public boolean solution(String s) {
        char[] array = s.toCharArray();

        if(s.length() == 4 || s.length() == 6){
            for (char c : array) {
                if (Character.isLetter(c)){
                    return false;
                }
            }

        } else {
           return false;
        }
        return true;
    }
}