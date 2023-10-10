package org.example.difficult1;

import java.util.Scanner;

public class 자릿수더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        int sum=0;
        while(T>0) {
            int tmp = T % 10;
            sum += tmp;
            T /= 10;
        }
        System.out.println(sum);
    }
}
