package leveltest1.이상한문자만들기;

class Solution {
    public String solution(String s) {
        String lowerCase = s.toLowerCase();
        String upperCase = s.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(count%2 ==0) {
               stringBuilder.append(upperCase.charAt(i));
            } else {
                stringBuilder.append(lowerCase.charAt(i));
            }
            if (s.charAt(i)== ' ') {
                count =0;
            } else {
                count ++;
            }
        }
        return stringBuilder.toString();
    }
}