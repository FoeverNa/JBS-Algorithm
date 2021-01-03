package leveltest1.소수찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {

            int count = 0;
            for (int j = 2; j < i ; j++) {
                if(i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count ==0 ){
                answer++;
            }

        }

        return answer;
    }
}