package org.example.difficult2;

import java.util.Scanner;

public class 달팽이숫자 {

    public static void main(String[] args) {
        int[] di = {0, 1, 0 ,-1};
        int[] dj = {1, 0, -1, 0};

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        int ni =0;
        int nj =0;
        int direct = 0;

        for(int i=1; i<= N*N; i++) {
            arr[ni][nj] = i;
            if(ni +di[direct]<0 || ni + di[direct] >=N ||
                    nj +dj[direct]<0 || nj + dj[direct] >=N || arr[ni + di[direct]][nj + dj[direct]] != 0) {
                direct = (direct+1)%4;
            }
            ni += di[direct];
            nj += dj[direct];
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
