package leveltest1.모의고사;

class Solution {
    public int[] solution(int[] answers) {

        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        int[][] students = {student1, student2, student3};

        int[] scores  = new int[3];

        for (int i = 0; i < answers.length ; i++) {
            for (int j = 0; j < scores.length; j++) {
                if(answers[i] == students[j][(i % students[j].length)]) {
                    scores[j]++;
                }
            }
        }

        int maxNum = 0;
        int winnerNum = 0;
        for (int i = 0; i < scores.length ; i++) {
            if(scores[i] > maxNum ) {
                maxNum = scores[i];
                winnerNum =1;
            }else if(scores[i] == maxNum){
                winnerNum++;
            }
        }

        int[] answer = new int[winnerNum];
        int index = 0;
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]==maxNum) {
                answer[index++] = i+1;
            }

        }
        return answer;
    }
}
