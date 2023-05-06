package org.example.level0;

public class 문자열내림차순으로배치하기 {
    static String solution(String s ){
        String answer = "";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        answer = reverse.toString();
        return answer;
    }
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
