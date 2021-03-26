package silver.s5.q1427;

import java.io.*;

public class Main {

    public static void main (String[] args ) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();

        int[] arr = new int[10];

        for(int i = 0; i < s.length(); i++ ) {
           int index = Character.getNumericValue(s.charAt(i));
           arr[index]++;
        }

        for(int i = arr.length-1 ; i >= 0; i--) {

            for(int j = 0; j < arr[i]; j++) {
                bw.write(String.valueOf(i));
            }
        }
        bw.flush();
        bw.close();
    }
}