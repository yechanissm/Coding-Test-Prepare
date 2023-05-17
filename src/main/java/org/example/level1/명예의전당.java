package org.example.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의전당 {

    static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++) {
            if(list.size()<k) {
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            }
            else if(list.size()==k) {
                int low = list.get(0);
                if(low < score[i]) {
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                }
                answer[i] = list.get(0);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] score = {10,100,20,150,1,100,200};
        int k = 3;

        System.out.println(Arrays.toString(solution(k, score)));

    }
}
