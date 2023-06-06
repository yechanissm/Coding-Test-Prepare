package org.example.level2.연습문제;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class 뒤에있는큰수찾기 {
    static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=numbers.length; i>=0; i--) {

            if(stack.isEmpty()) {
                answer[i] = -1;
            }

        }
    }

    public static void main(String[] args) {
        int[] numbers = {9,1,5,3,6,2};

        System.out.println(Arrays.toString(solution(numbers)));
    }
}
