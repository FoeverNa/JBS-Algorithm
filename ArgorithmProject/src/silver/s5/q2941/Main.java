package silver.s5.q2941;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        String[] croatianAlphabet = {"c=", "c-", "z=" , "d-", "lj", "nj", "s=", "z=" };

        int words = 1;

        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( c <'a' || c == 'i' || c == 'j') {
                String str = s.charAt(i - 1) +String.valueOf(c);
                for (String value : croatianAlphabet) {
                    if (str.equals(value)) {
                        if (value.equals("z=") && i - 2 >= 0 && s.charAt(i-2) == 'd') {
                            words -= 2;
                        } else {
                            words --;
                        }
                        break;
                    }
                }
            }
            words++;
        }
        System.out.println(words);
    }
}