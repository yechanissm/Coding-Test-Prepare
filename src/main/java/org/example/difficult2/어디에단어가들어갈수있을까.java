package org.example.difficult2;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count =0;
        int totalCount = 0;

        //가로 먼저 구하기
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(arr[i][j] ==1 ) {
                    count ++;
                }
                else if(arr[i][j] ==0 && count>=1){
                    if(count == K) {
                        totalCount++;
                    }
                    count=0;
                }
            }
            if(count == K) {
                totalCount++;
            }
            count=0;
        }
        //세로
        for(int j=0; j<N; j++) {
            for(int i=0; i<N; i++) {
                if(arr[i][j] ==1) {
                    count ++;
                }
                else {
                    if(arr[i][j] == 0 && count>=1) {
                        if(count==K) {
                            totalCount ++;
                        }
                        count=0;
                    }
                }
            }
            if(count == K) {
                totalCount++;
            }
            count =0;
        }
        System.out.println(totalCount);
    }
}
