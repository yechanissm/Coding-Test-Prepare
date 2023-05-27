package org.example;

public class memo2 {


    public static void main(String[] args) {
        String s =  "(){}[]";
        String tmp = s;
        int answer = 0;
        for(int i=0; i<s.length(); i++) {
            char c1 = s.charAt(0);
            tmp = s.substring(1);
            tmp += c1;
            s = tmp;
            for(int j=0; j<s.length()/2; j++) {
                tmp = tmp.replace("()", "");
                tmp = tmp.replace("[]", "");
                tmp = tmp.replace("{}", "");
            }
            if(tmp.equals("")){answer++;}
        }
        System.out.println(answer);
    }
}
