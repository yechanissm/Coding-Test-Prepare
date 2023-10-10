package org.example.difficult1;

import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int[] arr = new int[T];
            for(int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[T/2]);
        }
    }
}
