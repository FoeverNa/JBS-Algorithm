package bronze.bronze2.q5622;

import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String[] split = s.split("");
        String[] alphabets = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int answer = 0;
        for (int i = 0; i < split.length; i++) {
            {
                for (int j = 0; j < alphabets.length; j++) {
                    if (alphabets[j].contains(split[i])) {
                        answer += j + 3;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
