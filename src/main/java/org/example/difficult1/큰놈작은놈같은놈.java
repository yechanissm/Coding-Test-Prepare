package org.example.difficult1;

import java.util.Scanner;

public class 큰놈작은놈같은놈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            char answer;
            if (n1 == n2) {
                answer = '=';
            }
            else if (n1 > n2) {
                answer = '>';
            }
            else {
                answer = '<';
            }
            System.out.println("#" + test_case + " " + answer);
        }
    }
}
