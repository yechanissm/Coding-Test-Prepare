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
        int B = b / gcd(a,b);
        while( B != 1) {
            if(B%2 == 0) {
                B /= 2;
            }
            else if(B % 5 == 0) {
                b /= 5;
            }
            else {
                return 2;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(solution(7,20));
        System.out.println(solution(11,22));
        System.out.println(solution(12,21));

    }

}
