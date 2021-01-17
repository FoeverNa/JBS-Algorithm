package leveltest1.가운데글자가져오기;

class Solution {
    public String solution(String s) {

        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();


        if (chars.length % 2 == 0 ) {
            int half = chars.length/2;
            stringBuilder.append(chars[half-1]);
            stringBuilder.append(chars[half]);
        } else {
            int half = chars.length/2+1;
            stringBuilder.append(chars[half-1]);
        }


        return stringBuilder.toString();
    }
}