package leveltest1.알바펫코딩;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s, int n) {

        char[] charArray = s.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == ' ') {
                characterList.add(' ');
            } else {
                if (Character.isUpperCase(charArray[i])) {
                    int sum = (int)charArray[i] + n;
                    if (sum > 90) {
                        int value = sum-90;
                        sum = 64 + value;
                    }
                    characterList.add((char)sum);
                } else if (Character.isLowerCase(charArray[i])) {
                    int sum = (int) charArray[i] + n;
                    if (sum > 122) {
                        int value = sum - 122;
                        sum = 96 + value;
                    }
                    characterList.add((char) sum);
                }
            }

        }


        return  characterList.stream().map(String::valueOf)
                .collect(Collectors.joining());
    }
}