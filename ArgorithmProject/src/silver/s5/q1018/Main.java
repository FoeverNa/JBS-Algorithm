package silver.s5.q1018;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arrays = new char[n][m];

        // 체스판 초기화
        for(int i = 0; i < n; i++) {
            String s = bf.readLine();
            for(int j = 0; j < m; j++) {
                arrays[i][j] = s.charAt(j);
            }
        }

        // 페인팅할 것 찾기
        int painting = 0;
        int min = Integer.MAX_VALUE;
        //8개 단위로 판을 잘라서 페인팅할 값을 찾는다
        for (int i = 0; i <= n-8; i++) {
            for (int j = 0; j <= m-8; j++) {
                // 시작 값이 W인지 B인지 확인
                for(int c = 0; c < 2; c++) {
                    char start;
                    if (c == 0) {
                        start = 'B';
                    } else{
                        start = 'W';
                    }
                    painting = 0;
                    here:
                    for (int k = 0; k < 8 ; k++) {
                        for (int l = 0; l <8 ; l++) {
                            char w = arrays[i+k][j+l];
                            //현재의 값과 예상값이 다르면 페인트 칠할곳 ++
                            if (w != start) {
                                painting++;
                            }
                            //예상값을 스위치한다
                            start = changeWord(start);
                            // 최소값을 초과하면 더이상 연산하지않도록 break
                            if (painting >= min) {
                                break here;
                            }
                        }
                        //줄바꿈과 동시에 한번더 글자바꿔서 맞춰주기
                        start = changeWord(start);
                    }

                    //8x8를 다돌고 나서 최소값이 맞드면 갱신
                    if (min > painting) {
                        min = painting;
                    }
                }
            }

        }
        // 최소값 출력
        System.out.println(min);
    }

    // 단어 바꿔주는 메소드
    private static char changeWord(char c) {
        return c == 'W' ? 'B' : 'W';
    }
}

