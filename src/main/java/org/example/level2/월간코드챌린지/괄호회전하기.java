package org.example.level2.월간코드챌린지;

import java.util.Stack;

public class 괄호회전하기 {

    private static final Stack<Character> stack = new Stack<>();

    static int solution(String s) {
        int answer = 0;
        String tmp = s;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(0);
            tmp = s.substring(1);
            tmp += c1;
            s = tmp;
            for (int j = 0; j < s.length() / 2; j++) {
                tmp = tmp.replace("()", "");
                tmp = tmp.replace("[]", "");
                tmp = tmp.replace("{}", "");
            }
            if (tmp.equals("")) {
                answer++;
            }
        }
        return answer;
    }

    static int solution2(String s)  {
        int answer = 0;
        String tmp = "";
        for(int i=0; i<s.length(); i++) {
            char c1 = s.charAt(0);
            tmp = s.substring(1);
            tmp += c1;
            s = tmp;

            if(correctParenthesis(tmp.toCharArray())){
                answer ++;
            }
        }
        return answer;
    }

    private static boolean correctParenthesis(char[] s) {
        for(char c : s) {
            if(!(check(c,'(', ')') && check(c,'{', '}') && check(c,'[', ']'))){
                return false;
            }
        }
        return stack.isEmpty();
    }
    private static boolean check(char c, char a, char b) {
        if(c==a) {
            stack.push(a);
        }
        else if(c==b) {
            if(!stack.isEmpty() && stack.peek() == a) {
                stack.pop();
            }
            else {
                 return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "[](){}";
        String s2 = "}]()[{";

        System.out.println(solution(s));
        System.out.println(solution2(s));
        System.out.println(solution(s2));
        System.out.println(solution2(s2));
    }
}
