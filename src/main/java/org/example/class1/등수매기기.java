package org.example.class1;

import java.util.Arrays;

public class 등수매기기 {

    public static void main(String[] args) {
        int[][] score = {{80,70}, {90,50}, {40,70}};

        int[] answer = {};
        int[] sum_array = new int[score.length];

        //우선 합을 먼저 계산해야 한다. 그걸 배열로 만들어보자.
        for(int i=0; i<score.length; i++) {
            sum_array[i] = (score[i][0] + score[i][1])/2;
        }
        System.out.println("sum_array = " + Arrays.toString(sum_array));
    }
}
