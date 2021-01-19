package leveltest1.정수내림차순으로배치하기;

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(chars));
        return  Long.parseLong(stringBuilder.reverse().toString());
    }
}