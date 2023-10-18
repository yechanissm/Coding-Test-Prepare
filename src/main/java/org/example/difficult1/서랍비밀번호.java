package org.example.difficult1;

import java.util.Arrays;
import java.util.Scanner;

public class 서랍비밀번호 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();

        int count=0;

        for (int i=K; i<=P; i++) {
            count++;
            if(K==P) {
                break;
            }
        }
        System.out.println(count);
    }
}
