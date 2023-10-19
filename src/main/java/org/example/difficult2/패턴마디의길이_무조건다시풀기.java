package org.example.difficult2;

import java.util.Scanner;

public class 패턴마디의길이_무조건다시풀기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String answer = sc.next();
            int len = 0;
            for(int i=1; i<answer.length(); i++) {
                String b = answer.substring(0,i);
                String c = answer.substring(i,i+i);
                if(b.equals(c)) {
                    len = b.length();
                    break;
                }
            }

        }
    }
}
