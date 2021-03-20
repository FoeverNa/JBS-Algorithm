package bronze.bronze1.q2869;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{

    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day =1;
        if(A < V) {
          V -= A;
          day +=  V / (A-B);
          if (V % (A-B) != 0) {
              day++;
          }
        }
        System.out.println(day);
    }
}