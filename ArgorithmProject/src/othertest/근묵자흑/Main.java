package othertest.근묵자흑;

import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		
		
		int answer = (n-1) / (k-1);
		
		if( (n-1) % (k-1)  != 0 ) {
			answer ++;
		}
		System.out.println(answer);
		
	}
}