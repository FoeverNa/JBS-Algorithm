package leveltest1.두개뽑아서더하기;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i]+numbers[j]);
            }
        }
        list.sort(Integer::compareTo);

        for (int i = 0; i <list.size()-1 ; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                list.remove(i);
                i = -1;
            }

        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);

        }

        return answer;
    }
}