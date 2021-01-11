package leveltest1.k번째수;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tempArray;

        for (int i = 0; i < commands.length; i++) {
            tempArray = new int[commands[i][1]-commands[i][0]+1];
            System.arraycopy(array, (commands[i][0]-1), tempArray, 0, (commands[i][1]-commands[i][0]+1));
            Arrays.sort(tempArray);
            answer[i] = tempArray[commands[i][2]-1];
        }


        return answer;
    }
}