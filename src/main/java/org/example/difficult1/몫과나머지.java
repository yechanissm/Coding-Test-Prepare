package org.example.difficult1;

import java.util.Scanner;

public class 몫과나머지 {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int div = a/b;
            int rest = a%b;
            System.out.println("#"+ test_case + " " + div + " " + rest);

        }
    }
}
