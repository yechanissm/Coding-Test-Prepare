package org.example.level0;

public class 문자열다루기기본 {

    static boolean solution(String s) {
        boolean answer = false;
        int length = s.length();
        char[] chars = s.toCharArray();
        if(length==4 || length==6){
            answer = true;
        }
        for(char c : chars) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s1 = "a234";
        String s2 = "1234";

        System.out.println("s1 = " + solution(s1));
        System.out.println("s2 = " + solution(s2));
    }
}
