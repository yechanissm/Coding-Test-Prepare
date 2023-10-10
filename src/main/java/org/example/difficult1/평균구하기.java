package org.example.difficult1;

import java.util.Scanner;

public class 평균구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            double sum = 0;
            int avg = 0;
            for(int i=0; i< 10; i++) {
                int a = sc.nextInt();
                sum += a;
            }
            avg = (int)Math.round(sum/10);
            System.out.println("#" + test_case + " " + avg);
        }
    }
}
