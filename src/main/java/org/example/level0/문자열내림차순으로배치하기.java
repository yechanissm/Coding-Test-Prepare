package org.example.level0;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내림차순으로배치하기 {
    static String solution(String s ){
        String answer = "";
        String[] split = s.split("");
        Arrays.sort(split, Comparator.reverseOrder());
        for(String ss: split) {
            answer+=ss;
        }
        return answer;
    }
    //먼저 나누고, 정렬한다음 내림차순으로, Comparator.reverseOrder() 사용
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
