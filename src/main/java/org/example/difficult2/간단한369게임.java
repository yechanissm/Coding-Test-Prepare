package org.example.difficult2;

import java.util.Scanner;

public class 간단한369게임 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int i=1; i<=T; i++) {
            String s = String.valueOf(i);
            if(s.contains("3") == true || s.contains("6") == true ||s.contains("9") == true){
                s = s.replaceAll("3", "-")
                        .replaceAll("6", "-")
                        .replaceAll("9", "-")
                        .replaceAll("[0-9]", "");
            }

            System.out.print(s + " ");
        }
    }
}
