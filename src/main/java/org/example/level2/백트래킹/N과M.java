package org.example.level2.백트래킹;

import java.util.Scanner;

public class N과M {

    static int n, m;
    static int[] arr;
    static boolean[] isUsed;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        isUsed = new boolean[n];

        recursion(0);
    }

    private static void recursion(int index) {
        if(index==m) {
            for(int i=0; i<m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<n; i++) {
            if(!isUsed[i]) {
                isUsed[i] = true;
                arr[index] = i+1;
                recursion(index+1);
                isUsed[i] = false;
            }
        }
    }
}
