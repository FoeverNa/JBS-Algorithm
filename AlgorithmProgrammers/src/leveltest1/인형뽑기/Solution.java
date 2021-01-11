package leveltest1.인형뽑기;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        Integer lastDoll = 0;
        for (int i = 0; i < moves.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                if (board[j][moves[i]-1] > 0) {
                    basket.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;

                    if(basket.size() >=2) {
                        if(lastDoll.equals(basket.peek())){
                            basket.pop();
                            basket.pop();
                            answer+=2;
                        }
                    }
                    if(!basket.empty()){
                        lastDoll = basket.peek();
                    }

                    break;
                }
            }
        }


        return answer;
    }
}