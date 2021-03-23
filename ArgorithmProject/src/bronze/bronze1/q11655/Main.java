package bronze.bronze1.q11655;
import java.io.*;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i =0; i < s.length(); i++) {
            char val =  s.charAt(i);
            if('A'<= val & val <= 'Z') {
                val += 13;
                if ( val > 'Z' ) {
                    val -= 26;
                }
            } else if( 'a'<= val & val <= 'z') {
                val += 13;
                if ( val > 'z' ) {
                    val -= 26;
                }
            }
            sb.append(val);
        }
        System.out.println(sb);
    }
}