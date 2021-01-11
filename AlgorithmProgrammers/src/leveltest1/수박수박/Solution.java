package leveltest1.수박수박;

class Solution {
    public String solution(int n) {

        StringBuilder stringBuilder = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0 ){
                stringBuilder.append("박");
            } else {
                stringBuilder.append("수");
            }
        }
        return stringBuilder.toString();
    }
}