package org.example.difficult2;

import java.util.Scanner;

public class 초심자의회문검사 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        boolean check = true;
        for(int i=0; i<answer.length()/2; i++) {
            if(answer.charAt(i)==answer.charAt(answer.length()-1-i)) {
            }
            else {
                check = false;
                break;
            }
        }
        if(check) {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }


    }
}
