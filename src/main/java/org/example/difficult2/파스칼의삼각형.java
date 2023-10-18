package org.example.difficult2;

import java.util.Scanner;

public class 파스칼의삼각형 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int line = sc.nextInt();
            int[][] array = new int[line][line];
            for(int i=0; i<line; i++) {
                for(int j=0; j<=i; j++) {
                    if(i==j || j==0) {
                        array[i][j] = 1;
                    }
                    else {
                        array[i][j] = array[i-1][j-1] + array[i-1][j];
                    }
                }
            }
            System.out.println("#" + test_case);
            for(int i=0; i<line; i++) {
                for(int j=0; j<=i; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}
// i[0]j[0]
// i[1]j[0] 1 i[1]j[1] 1
// i[2]j[0] 1 i[2]j[1] 2 i[2]j[2] 1
// i[3]j[0] 1 i[3]j[1] 3 i[3]j[2] 3 i[3]j[3] 1
// i[4]j[0] 1 i[4]j[1] 4 i[4]j[2] 6 i[4]j[3] 4 i[4]j[4] 1