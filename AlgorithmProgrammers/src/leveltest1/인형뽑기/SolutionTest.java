package leveltest1.인형뽑기;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[][] board2 ={{0, 0, 1, 0, 0}, {0, 0, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}, {0, 2, 1, 0, 0}};
        int[][] board3 ={{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int[] moves2 = {1, 2, 3, 3, 2, 3, 1};
        int[] moves3 = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3,3,3,3,3,4,4,4,4,4,5,5,5,5,5};
        Solution sol = new Solution();

        System.out.println(sol.solution(board, moves));
        System.out.println(sol.solution(board2, moves2));
        System.out.println(sol.solution(board3, moves3));

    }
}

