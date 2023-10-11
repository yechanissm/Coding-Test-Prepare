package org.example.difficult1;

import java.util.Scanner;

public class 신문헤드라인 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String answer = "";

        for(int i=0; i<T.length(); i++) {
            char c = T.charAt(i);
            int c_int = (int)c;
            if(c_int >= 97 && c_int <= 122) {
                answer += Character.toUpperCase(c);
            }
            else {
                answer += c;
            }
        }
        System.out.println(answer);
    }
}
