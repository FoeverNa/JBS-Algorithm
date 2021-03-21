package bronze.bronze1.q2167;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arrays = new int[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < m; j++) {
                arrays[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int t = Integer.parseInt(bf.readLine());
        int sum;
        for(int i = 0 ; i < t ; i++){
            st = new StringTokenizer(bf.readLine());
            int k = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            sum = 0;
            for( int o = k-1 ; o < x ; o++) {
                for(int w = j-1; w < y ; w++) {
                    sum += arrays[o][w];
                }
            }
            System.out.println(sum);
        }
    }
}