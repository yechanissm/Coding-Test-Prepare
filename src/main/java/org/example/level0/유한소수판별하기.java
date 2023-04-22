package org.example.level0;

public class 유한소수판별하기 {

    //유클리드 호재법!!최대공약수 구하기
    static int gcd(int a, int b) {
       if(b == 0) {
           return a;
       } else {
           return gcd(b, a%b);
       }
    }
    public static int solution(int a, int b) {
        b /= gcd(a, b);
        while (b != 1) {
            if (b % 5 == 0) {
                b /= 5;
                continue;
            }
            if (b % 2 == 0) {
                b /= 2;
                continue;
            }
            return 2;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(solution(7,20));
        System.out.println(solution(11,22));
        System.out.println(solution(12,21));

    }

}
