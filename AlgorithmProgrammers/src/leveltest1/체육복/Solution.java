package leveltest1.체육복;

class Solution {

    public static int c;

    public int solution(int n, int[] lost, int[] reserve) {

        int rent = 0;
        for (int i = 0; i < lost.length ; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    rent++;
                    reserve[j] = -50;


                    lost[i] = -100;
                }
            }
        }

        for (int i = 0; i < lost.length ; i++) {
            for (int j = 0; j < reserve.length ; j++) {
                if((lost[i]+1) == reserve[j] || (lost[i]-1) == reserve[j]) {
                    rent++;
                    reserve[j] = -200 ;
                    break;
                }
            }
        }

        return n-lost.length+rent;
    }
}