package org.example.difficult1;

import java.util.Scanner;

public class 알파벳을숫자로치환 {

    public static String solution(String T) {
        String answer = "";
        for(int i=0; i<T.length(); i++) {
            char c = T.charAt(i);
            int tmp = (int)c-64;
            if(i == T.length()-1) {
                answer += String.valueOf(tmp);
            }
            else {
                answer += String.valueOf(tmp) + " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String T = sc.next();

        System.out.println(solution(T));
    }
}
