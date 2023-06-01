package org.example.level2.카카오;

import java.util.Stack;

public class 괄호변환 {

    public static String solution(String p) {
        String answer = "";
        if(isCorrect(p)) {
            return p;
        }
        answer = dps(p);
        return answer;
    }
    static boolean isCorrect(String p) {
        Stack<Character> st  = new Stack<>();
        for(int i=0; i<p.length(); i++) {
            if(p.charAt(i)=='(') {
                st.push('(');
            }
            else{
                if(st.isEmpty() || st.peek()==')'){
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }
        return true;
    }

    static String dps(String w) {
        if (w.length() == 0) {
            return w;
        }
        String u = "";
        String v = "";
        String str = "";
        int check = 0;

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(0) == '(') {
                check++;
            } else {
                check--;
            }
            if (check == 0) {
                u += w.substring(0, i + 1);
                v += w.substring(i + 1);
                break;
            }
        }

        if (isCorrect(u)) {
            return u + dps(v);
        } else {
            String tmp = "(";
            tmp += dps(v);
            tmp += ")";

            u = u.substring(1, u.length() - 1);

            for (int i = 0; i < u.length(); i++) {
                if (u.charAt(i) == '(') {
                    tmp += ')';
                } else {
                    tmp += '(';
                }
            }
            return tmp;
        }
    }

    public static void main(String[] args) {
        String p = "(()())()";
        String p2 = ")(";
        String p3 = "()))((()";

        System.out.println(solution(p2));
        System.out.println(solution(p3));
    }
}
