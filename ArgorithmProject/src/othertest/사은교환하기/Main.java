package othertest.사은교환하기;

import java.io.*;
import java.util.StringTokenizer;
	
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		long N, M;
		
		long answer ;
		
		for(int i = 0 ; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Long.parseLong(st.nextToken());
			M = Long.parseLong(st.nextToken());
			answer =0;
			for(int j = 0 ; j < 7 ; j ++) {
				if(N < 5+j && M < 1 ) {
					break;
				}
			long a = Math.min(N / (5+j), M / (7-j));
				if(a> 0) {
					N = N-((5+j)*a);
					M = M -((7-j)*a);
					answer += a;
				}
			}
			answer += N/12;
			System.out.println(answer);
		}
	}
}