package org.example.level0;

public class 이상한문자만들기 {

    static String solution(String s) {
        String answer = "";
        int temp = 0;
        String[] strs = s.split("");
        for (String str : strs) {
            if(str.equals(" ")) {
                temp = 0;
                answer += " ";
            }
            else if(temp%2==0) {
                String s1 = str.toUpperCase();
                answer+=s1;
                temp++;
            }
            else {
                String s1 = str.toLowerCase();
                answer+=s1;
                temp++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world  ";
        System.out.println(solution(s));
    }
}
