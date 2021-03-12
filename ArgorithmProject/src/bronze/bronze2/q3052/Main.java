package bronze.bronze2.q3052;

import java.io.*;
        import java.util.HashSet;
        import java.util.Set;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10 ; i++) {
            int value = Integer.parseInt(bf.readLine());
            set.add(value%42);
        }
        System.out.println(set.size());
    }
}