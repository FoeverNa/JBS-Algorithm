package leveltest1.완주하지못한선수;

public class SolutionTest {
    public static void main(String[] args) {
        String[] participant1 ={"leo", "kiki", "eden"};
        String[] participant2 ={"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant3 ={"mislav", "stanko", "mislav", "ana"};

        String[] completion1 = {"eden", "kiki"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        Solution sol = new Solution();


        System.out.println(sol.solution(participant1, completion1));
        System.out.println(sol.solution(participant2, completion2));
        System.out.println(sol.solution(participant3, completion3));
    }
}

