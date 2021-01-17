package leveltest1.문자열내마음대로정렬하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings);
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for (int i = 0; i < list.size()-1 ; i++) {
            if (list.get(i).charAt(n)>list.get(i+1).charAt(n)) {
                list.add(i+1, list.remove(i));
                i=-1;
            }
        }
               return list.toArray(new String[0]);
        }

}