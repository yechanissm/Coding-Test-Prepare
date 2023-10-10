package org.example.difficult1;

import java.util.Scanner;

public class 홀수더하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int[] array = new int[10];
            int sum =0;
            for(int i=0; i<10; i++) {
                array[i]  = sc.nextInt();
            }
            for(int i=0; i<10; i++) {
                if(array[i]%2==1) {
                    sum+= array[i];
                }
            }
            System.out.println("#"+ test_case + " " + sum);
        }
    }
}
