package bronze.bronze1.q1924;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[2];
        for(int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] daysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = arr[1];
        for(int i = 0; i < arr[0] - 1; i++) {
            day += daysOfMonths[i];
        }
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        System.out.println(days[(day%7)]);

        }
    }