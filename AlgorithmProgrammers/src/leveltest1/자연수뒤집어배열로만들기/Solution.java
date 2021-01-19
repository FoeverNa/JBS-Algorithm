package leveltest1.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        long divisor =10;
        for (int i = 0; i <str.length() ; i++) {
            answer[i] = (int)(n % divisor);
            n = n / 10;
        }
        return answer;
    }
}