package org.example.level0;

import java.util.Arrays;

public class 예산 {

    static int solution(int[] d, int budget){
        int answer =0;
        Arrays.sort(d);
        for(int dd : d) {
            if(budget >= dd) {
                budget-=dd;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        int[] d = {1,3,2,5,4};
        int[] d2 = {2,2,3,3};
        int budget = 9;
        int budget2= 10;

        System.out.println(solution(d, budget));
        System.out.println(solution(d2,budget2));
    }
}
