package org.example.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 가장가까운같은글자 {

    static int[] solution(String s) {
        String[] str = s.split("");
        int[] answer = new int[str.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<str.length; i++) {
            if(map.get(str[i])==null) {
                answer[i] = -1;
            }
            else {
                answer[i] = i - map.get(str[i]);
            }
            map.put(str[i], i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "banana";

        System.out.println(Arrays.toString(solution(s)));
    }
}
