package bronze.bronze1.q2740;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] nm = new int[n][m];

        for(int i = 0; i < n ; i ++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < m; j ++) {
                nm[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(bf.readLine());

        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] mk = new int[m][k];

        for(int i = 0; i < m ; i ++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < k; j ++) {
                mk[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] multi = new int[n][k];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <k ; j++) {
                for (int l = 0; l <m ; l++) {
                    multi[i][j] += nm[i][l] * mk[l][j];
                }

            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <k ; j++) {
                sb.append(multi[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

