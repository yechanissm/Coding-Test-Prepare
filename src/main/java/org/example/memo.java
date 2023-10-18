package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class memo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int max = 0;

        int[][] array = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N-M+1; i++) {
            for(int j=0; j<N-M+1; j++) {
                int sum = 0;
                for(int a=0; a<M; a++) {
                    for(int b=0; b<M; b++) {
                        sum += array[i+a][j+b];
                    }
                }
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);

    }
}
