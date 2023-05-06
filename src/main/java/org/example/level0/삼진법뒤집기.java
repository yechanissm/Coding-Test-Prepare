package org.example.level0;

public class 삼진법뒤집기 {

    static int solution(int n) {
        int answer =0;
        String sss = "";
        while(n>0) {
            sss += n%3;
            n /=3;
        }
        answer = Integer.parseInt(sss, 3);
        return answer;
    }

    public static void main(String[] args) {
        int n1 =45;
        int n2 = 125;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
