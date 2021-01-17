package leveltest1.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long bigNum ;
        long smallNum;
        long answer = 0;
        if(a==b) {
            return a;
        } else if(a > b) {
            bigNum = a;
            smallNum = b;
        } else {
            bigNum = b;
            smallNum = a;
        }

        for (long i = smallNum; i <= bigNum ; i++) {
                answer += i;
        }

        return answer;
    }
}