package org.example.level0;

import java.util.Arrays;

public class 문자열내맘대로정렬하기 {
    static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for(int i=0; i<answer.length; i++) {
            char n_char = strings[i].charAt(n);
            answer[i] = n_char + strings[i];
        }
        Arrays.sort(answer);
        for(int i=0; i<answer.length; i++) {
            answer[i] = answer[i].substring(1,answer[i].length());
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int  n =1;

        System.out.println(Arrays.toString(solution(strings,n)));
    }
}
