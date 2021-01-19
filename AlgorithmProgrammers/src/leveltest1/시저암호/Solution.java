package leveltest1.시저암호;

class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        boolean isUpperCase;
        for (int i = 0; i <chars.length ; i++) {
            isUpperCase=false;
            if(chars[i] == ' '){
                continue;
            }
            if(chars[i] <= 90) {
                isUpperCase =true;
            }

            int temp = chars[i]+n;

            if (isUpperCase) {
                if(temp > 90) {
                    temp = 64 + (temp-90);
                }
            } else {
                if(temp > 122 ){
                    temp = 96 + (temp-122);
                }
            }
            chars[i] = (char)temp;
        }
        return String.valueOf(chars);
    }
}