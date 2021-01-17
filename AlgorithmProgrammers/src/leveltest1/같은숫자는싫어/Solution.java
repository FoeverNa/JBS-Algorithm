package leveltest1.같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int temp = -1;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
               list.add(arr[i]);
            }
            temp = arr[i];
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}