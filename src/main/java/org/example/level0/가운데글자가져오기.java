package org.example.level0;

public class 가운데글자가져오기 {

    static String solution(String s) {
        String answer = "";
        int len = s.length();
        if (len%2!=0) {
            char c = s.charAt(len / 2);
            answer += String.valueOf(c);
        }
        else {
            char c1 = s.charAt(len/2-1);
            char c2 = s.charAt(len/2);
            answer += String.valueOf(c1) + String.valueOf(c2);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "qwer";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
