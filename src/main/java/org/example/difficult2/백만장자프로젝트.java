package org.example.difficult2;

import java.util.Scanner;

public class 백만장자프로젝트 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // N일 동안 진행됨
            int[] days = new int[N];

            int max = 0;
            int sum = 0;

            for(int i=0; i<N; i++) {
                days[i] = sc.nextInt();
            }
            for(int i=days.length-1; i>=0; i--) {
                int today = days[i];
                if(max > today){
                    sum += max-today;
                }
                else {
                    max = today;
                }
            }
            System.out.println(sum);

        }
    }
}
