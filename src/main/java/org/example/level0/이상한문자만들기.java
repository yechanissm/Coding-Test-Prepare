package org.example.level0;

public class 이상한문자만들기 {

    static String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");
        for (String word : words) {
            for(int i=0; i<word.length(); i++) {
                if(i%2==0) {
                    char c = word.charAt(i);
                    char c1 = Character.toUpperCase(c);
                    answer+=c1;
                }
                else{
                    char c = word.charAt(i);
                    char c1 = Character.toLowerCase(c);
                    answer+=c1;
                }
            }
            answer += " ";
        }
        answer = answer.trim();
        return answer;
    }

    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
