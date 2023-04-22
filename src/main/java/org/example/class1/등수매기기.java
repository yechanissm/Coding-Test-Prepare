package org.example.class1;

import java.util.Arrays;

public class 등수매기기 {

    public static void main(String[] args) {
        int[][] score = {{80,70}, {90,50}, {40,70}};


        int[] sum_array = new int[score.length];
        int[] answer = new int[sum_array.length];

        //우선 합을 먼저 계산해야 한다. 그걸 배열로 만들어보자.
        for(int i=0; i<score.length; i++) {
            sum_array[i] = (score[i][0] + score[i][1])/2;
        }
        //등수 매기는 배열
        for(int i=0; i<sum_array.length; i++) {
            answer[i] = 1;
            for(int j=0; j<sum_array.length; j++) {
                if(sum_array[i] < sum_array[j]) {
                    answer[i] ++;
                }
            }
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
