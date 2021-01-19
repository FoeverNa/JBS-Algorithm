package leveltest1.제일작은수제거하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int minVal = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < minVal) {
                minVal = arr[i];
                index = i;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (i == index) {
                continue;
            }
            list.add(arr[i]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}