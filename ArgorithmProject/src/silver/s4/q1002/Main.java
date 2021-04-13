package silver.s4.q1002;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t ; i++) {
            st = new StringTokenizer(bf.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int result = contactPoint(x1, y1, r1, x2, y2, r2);

            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    private static int contactPoint(int x1, int y1, int r1, int x2, int y2, int r2) {

        int distance_pow = (int)( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        //원이 겹치는 경우 = 접점무한대
        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return - 1;
        }
        // 접점이 없을 때
        else  if(distance_pow > Math.pow((r1 + r2),2)) {
            return 0;
        }

        // 한원이 다른원 안에 있을때
        else if (distance_pow < Math.pow((r1 - r2),2)) {
            return 0;
        }
        // 접점이 한개일때 - 내접할때
        else if (distance_pow == Math.pow((r1 - r2),2)) {
            return 1;
        }

        // 접접이 한개일 때 - 외접할때

        else if(distance_pow == Math.pow(r1+r2, 2)) {
            return 1;
        }

        else {
            return 2;
        }
    }

}
