package org.example;


import java.util.*;

public class memo {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        int count  = 1;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                arr[i][j] = count;
                count++;
            }
        }
        //전치 행렬 만들기
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                arr[j][i] = arr[i][j];
            }
        }

    }
}

