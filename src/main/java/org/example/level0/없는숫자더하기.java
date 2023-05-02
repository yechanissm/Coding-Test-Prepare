package org.example.level0;

import java.util.Arrays;

public class 없는숫자더하기 {
    static int solution(int[] numbers){
        int answer = 0;
        for(int i=1; i<=9; i++) {
            boolean result = checking(i, numbers);
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};
        int solution = solution(numbers1);
        System.out.println(solution);
    }
}
