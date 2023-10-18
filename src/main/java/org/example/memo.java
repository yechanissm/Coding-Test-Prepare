package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class memo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N일 동안 진행됨
        int[] days = new int[N+2];

        int sum = 0; //총 이익
        int buy = 1; //구매한 돈

        for(int i=0; i<N+2; i++) {
            if(i <= N) {
                days[i] = sc.nextInt();
            }
            else {
                days[i] = 0;
            }
        }
        for(int i=0; i<days.length; i++) {
            if(days[i] > days[i+1]) {
                continue;
            }
            buy += days[i];
            if(days[i+1] > days[i+2]) {
                sum += buy * days[i+1];
                buy = 0;
            }
        }


    }
}
