package silver.s5.q1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.HashSet;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();

        for(int i = 0 ; i < t ; i++) {
            set.add(bf.readLine());
        }

        List<String> list = new ArrayList<>(set);

        list.sort((s1, s2) -> {
            if (s1.length()  == s2.length()) {
                return(s1.compareTo(s2));
            } else {
                return s1.length() - s2.length();
            }
        });

        for(String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}