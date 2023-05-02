package org.example.level0;

import java.util.Arrays;

public class 제일작은수제거하기 {

    static int[] solution(int[] arr){
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0]; //최소값 구하기
    }

    public static void main(String[] args) {
        System.out.println(solution({4,3,2,1));
        System.out.println(solution({10}));
    }
}
