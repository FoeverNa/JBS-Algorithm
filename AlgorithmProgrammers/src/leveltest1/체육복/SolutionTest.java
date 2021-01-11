package leveltest1.체육복;

public class SolutionTest {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 5;
        int n3 = 3;
        int n4 = 5;
        int n5 = 5;
        int n6 = 5;
        int n7 = 5;
        int n8 = 30;
        int n9 = 5;

        int[] lost1 = {2, 4};
        int[] lost2 = {2, 4};
        int[] lost3 = {3};
        int[] lost4 = {1, 5};
        int[] lost5 = {1, 5};
        int[] lost6 = {1,2,3,4,5};
        int[] lost7 = {1, 2, 3, 4, 5};
        int[] lost8 = {3, 13, 23, 27};
        int[] lost9 = {1,2,5};


        int[] reserve1 = {1, 3, 5};
        int[] reserve2 = {3};
        int[] reserve3 = {1};
        int[] reserve4 = {3};
        int[] reserve5 = {4};
        int[] reserve6 = {3};
        int[] reserve7 = {3};
        int[] reserve8 = {3, 13, 23, 27};
        int[] reserve9 = {2,3};

        Solution sol = new Solution();

        System.out.println(sol.solution(n1, lost1, reserve1));
        System.out.println(sol.solution(n2, lost2, reserve2));
        System.out.println(sol.solution(n3, lost3, reserve3));
        System.out.println(sol.solution(n4, lost4, reserve4));
        System.out.println(sol.solution(n5, lost5, reserve5));
        System.out.println(sol.solution(n6, lost6, reserve6));
        System.out.println(sol.solution(n7, lost7, reserve7));
        System.out.println(sol.solution(n8, lost8, reserve8));
        System.out.println(sol.solution(n9, lost9, reserve9));
    }
}

