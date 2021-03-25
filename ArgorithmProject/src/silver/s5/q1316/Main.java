package silver.s5.q1316;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(bf.readLine());
        Map<Character, Integer> map = new HashMap<>();

        char before;
        int groupNum = t;
        for (int i = 0; i < t; i++) {
            before = 'B';
            map.clear();
            st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c != before & map.get(c) != null) {
                    groupNum--;
                    break;
                } else {
                    map.put(c, 0);
                    before = c;
                }
            }
        }
        System.out.println(groupNum);
    }
}