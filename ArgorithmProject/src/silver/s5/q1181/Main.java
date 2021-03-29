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

        Collections.sort(list);

        list.sort(Comparator.comparingInt(String::length));

        for(String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
}