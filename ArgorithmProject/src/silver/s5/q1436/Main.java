package silver.s5.q1436;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
            if(s.contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}