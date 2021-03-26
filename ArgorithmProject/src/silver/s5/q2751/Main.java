package silver.s5.q2751;

import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int t = Integer.parseInt(bf.readLine());
            int max = 1000000;
            boolean[] plusArr = new boolean[max+1];
            boolean[] minusArr = new boolean[max+1];

            for (int i = 0; i < t; i++) {
                int v = Integer.parseInt(bf.readLine());
                if (v < 0) {
                    minusArr[Math.abs(v)] = true;
                } else{
                    plusArr[v] = true;
                }
            }

            for (int i = max; i > 0; i--) {
                if (minusArr[i]) {
                    bw.write("-" + i + "\n");
                }
            }

            for (int i = 0; i < max+1; i++) {
                if (plusArr[i]) {
                    bw.write(i + "\n");
                }
            }

            bw.flush();
            bw.close();
        }
    }