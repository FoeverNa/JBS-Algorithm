package bronze.bronze1.q10798;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[15];
        for (int i = 0; i < array.length ; i++) {
            array[i] = "";
        }

        for (int i = 0; i <5 ; i++) {
            String s = bf.readLine();
            for (int j = 0; j < s.length() ; j++) {
              array[j] += s.charAt(j);
            }
        }
        for(String s : array) {
            if(s != null){
                System.out.print(s);
            } else {
                break;
            }
        }
    }
}