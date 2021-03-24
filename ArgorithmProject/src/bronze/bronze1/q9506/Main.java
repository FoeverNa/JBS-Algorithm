package bronze.bronze1.q9506;

import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int val = Integer.parseInt(br.readLine());
            if(val < 0) {
                break;
            } else {
                StringBuilder sb = new StringBuilder(val + " = 1");
                int sum = 1;
                for(int i = 2; i < val ; i++ ) {
                    if (val % i == 0) {
                        sb.append(" + ").append(i);
                        sum += i;
                    }
                }

                if (val == sum) {
                    bw.write(sb.toString() + "\n");
                } else {
                    bw.write(val +" is NOT perfect." + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}