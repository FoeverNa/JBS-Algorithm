package leveltest1.정수제곱근판별;

class Solution {
    public long solution(long n) {
        long answer = -1;
        int i = 1;
        while (n/i >= i) {
         if(n % i ==0 && n/i == i){
             answer = i;
         }
         i++;
        }

        return answer == -1 ? -1 : (long)Math.pow(answer+1,2);
    }
}