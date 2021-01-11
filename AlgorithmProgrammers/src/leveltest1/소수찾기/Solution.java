package leveltest1.소수찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;

        boolean[] array = new boolean[n+1];
        for (int i = 2; i <= n ; i++) {
            array[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if(array[i] == true) {
                answer++;
                for (int j = 1; j*i <= n ; j++) {
                        array[i*j] =false;
                }
            }
        }

        return answer;
    }
}