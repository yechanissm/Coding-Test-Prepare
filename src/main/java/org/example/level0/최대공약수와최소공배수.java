package org.example.level0;

public class 최대공약수와최소공배수 {

    static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = Math.max(n,m);
        int small = Math.min(n,m);
        return answer;
    }
    public static void main(String[] args) {
        int n =3;
        int m = 12;
        int n1 = 2;
        int n2 = 5;
        System.out.println(solution(n,m));
        System.out.println(solution(n1,n2));
    }
}
