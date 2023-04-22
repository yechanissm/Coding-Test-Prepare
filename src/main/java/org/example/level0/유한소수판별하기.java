package org.example.level0;

public class 유한소수판별하기 {

    public static int solution(int a, int b) {
        int answer = 0;

        for(int i=1; i<b; i++) {
            if(a % i == 0 ) {
                if (b % (a/i) == 0) {
                    return 1;
                }
            }

        }
        return 2;

    }

    public static void main(String[] args) {

        System.out.println(solution(7,20));
        System.out.println(solution(11,22));
        System.out.println(solution(12,21));
    }

}
