package org.example.difficult2;

import java.util.Scanner;

public class 스도쿠검증 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int sign = 1;

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //횡렬 확인
        for(int i=0; i<9; i++){
            int rsum = 0;
            int csum = 0;
            for(int j=0; j<9; j++) {
                rsum += arr[i][j];
                csum += arr[j][i];
            }
            if(rsum !=45 || csum !=45) {
                sign = 0;
                break;
            }
        }
        for(int i=0; i<9; i+=3) {
            for(int j=0; j<9; j+=3) {
                int sum = 0;
                for(int a=0; a<3; a++) {
                    for(int b=0; b<3; b++) {
                        sum += arr[a][b];
                    }
                }
                if(sum != 45) {
                    sign =0;
                    break;
                }
            }
        }
        System.out.println("#" +   sign);

    }
}
