package org.example.difficult1;

import java.util.Scanner;

public class 간단한N의약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1; i<=N; i++) {
            if(N%i==0) {
                if(i==N) {
                    System.out.print(i);
                }
                else{
                    System.out.print(i+ " ");
                }
            }
        }
    }
}
