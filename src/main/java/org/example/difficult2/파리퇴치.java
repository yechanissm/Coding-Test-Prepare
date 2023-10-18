package org.example.difficult2;

import java.util.Scanner;

public class 파리퇴치 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] array = new int[N][N];
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            for(int i=0; i<N-M+1; i++) {
                for(int j=0; j<N-M+1; j++) {
                    int sum = 0;
                    for(int a=0; a<M; a++) {
                        for(int b =0; b<M; b++) {
                            sum += array[i+a][j+b];
                        }
                    }
                    max = Math.max(sum, max);
                }
            }
            System.out.println("#" + T  + " " + max);

        }
    }
}
