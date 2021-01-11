package leveltest1.번호가리기;

class Solution {
    public String solution(String phone_number) {

        char[] charArray = phone_number.toCharArray();
        int count = 0;
        for (int i = charArray.length-1; i >=0 ; i--) {
            count++;
            if (count > 4) {
                charArray[i] = '*';
            }
        }

        return String.valueOf(charArray);
    }
}