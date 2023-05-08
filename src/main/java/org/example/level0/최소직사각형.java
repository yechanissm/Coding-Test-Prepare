package org.example.level0;

import java.util.Arrays;

public class 최소직사각형 {

    static int solution(int[][] sizes) {
        int answer =0;
        int t=0;
        int[][] sorted_sizes = new int[sizes.length][sizes[0].length];
        for(int[] size : sizes) {
            if(size[0] >= size[1]) {
                sorted_sizes[t][0] = size[0];
                sorted_sizes[t][1] = size[1];
            }
            else {
                sorted_sizes[t][0] = size[1];
                sorted_sizes[t][1] = size[0];
            }
            t++;
        }
        int m1 = 0;
        int m2 = 0;
        for(int i=0; i<sorted_sizes.length; i++) {
            if(sorted_sizes[i][0] > m1) {
                m1 = sorted_sizes[i][0];
            }
            if(sorted_sizes[i][1] > m2) {
                m2 = sorted_sizes[i][1];
            }
        }
        answer = m1*m2;
        return answer;
    }

    public static void main(String[] args) {

        int[][] sizes = {{60,50}, {30,70}, {60,30}, {80,40}};

        System.out.println(solution(sizes));
    }
}
