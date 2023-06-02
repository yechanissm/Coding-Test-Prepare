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
        StringBuilder sb = new StringBuilder(p);
        String[] tmp = splitString(p);
        String u = tmp[0];
        String v = tmp[1];

        return u;
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
                String v = "";
                if(p.length()>= i+1){
                    System.out.println(p.length());
                    System.out.println(p);
                    v = p.substring(i+1);
                }
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
