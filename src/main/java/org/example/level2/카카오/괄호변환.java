package org.example.level2.카카오;

import java.util.Stack;

public class 괄호변환 {

    public static String solution(String p) {
        return go(p);
    }

    private static String go(String p) {
        if(p.equals("")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] tmp = splitString(p);
        String u = tmp[0];
        String v = tmp[1];

        if(isCorrect(u)){
            sb.append(u).append(go(v));
        }
        else {
            sb.append('(').append(go(v)).append(')').append(removeAndReverse(u));
        }
        return sb.toString();
    }

    private static String removeAndReverse(String u) {
        u = u.substring(1, u.length()-1);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<u.length(); i++) {
            if(u.charAt(i)=='(') {
                sb.append(')');
            }
            else {
                sb.append('(');
            }
        }
        return sb.toString();
    }

    private static boolean isCorrect(String u) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<u.length(); i++) {
            if(u.charAt(i)=='(') {
                st.push('(');
            }
            else {
                if(st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    private static String[] splitString(String p) {
        int key = 0;
        for(int i=0; i<p.length(); i++) {
            if(p.charAt(i)=='(') {
                key++;
            }
            else {
                key--;
            }
            if(key==0) {
                String u = p.substring(0,i+1);
                String v = p.substring(i+1);

                return new String[] {u,v};
            }
        }
        return new String[] {"", ""};
    }

    public static void main(String[] args) {
        String p = "(()())()";
        String p2 = ")(";
        String p3 = "()))((()";

        System.out.println(solution(p));
        System.out.println(solution(p2));
        System.out.println(solution(p3));
    }
}
