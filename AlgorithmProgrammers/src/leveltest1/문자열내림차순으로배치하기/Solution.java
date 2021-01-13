package leveltest1.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {

        char[] charArray = s.toCharArray();

        Character[] characters = new Character[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            characters[i] = charArray[i];

        }

        Arrays.sort(characters, Collections.reverseOrder());

        for (int i = 0; i <characters.length ; i++) {
            charArray[i] = characters[i];
        }

        return String.valueOf(charArray);
    }
}