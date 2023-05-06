package org.example.level0;

public class 수박수박수박수박 {
    static String solution(int n) {
        String answer = "";
        String soobak ="수박";
        if(n%2==0) {
            for(int i=0; i<n/2; i++) {
                answer += soobak;
            }
        }
        else{
            for (int i=0; i<n/2; i++) {
                answer+=soobak;
            }
            answer += soobak.charAt(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;

        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
