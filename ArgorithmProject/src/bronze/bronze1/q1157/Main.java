package bronze.bronze1.q1157;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split("");
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < str.length; i++) {
            String key = str[i].toUpperCase();
            int preValue = map.getOrDefault(key,  0);
            map.put(key, preValue+1);
        }
        Set<String> keySet = map.keySet();

        map.
        int max = -1;
        String maxKey = "";
        int sameMax = -1;

        for (String key : keySet) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                maxKey = key;
            } else if (value == max) {
                sameMax = value;
            }
        }
        String answer ;
        if(max == sameMax) {
            answer = "?";
        } else {
            answer = maxKey;
        }
        System.out.println(answer);
    }
}