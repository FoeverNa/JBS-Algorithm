package silver.s5.q1436;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args ) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int num = 666;
        int count = 1;

        while(count < n) {
            num++;
            String s = String.valueOf(num);
            for(int i =0; i < s.length(); i++) {
                if (s.length() -i >= 3 && s.charAt(i) == '6') {
                    if( s.charAt(i+1) == '6' && s.charAt(i+2) == '6') {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(num);
    }
}