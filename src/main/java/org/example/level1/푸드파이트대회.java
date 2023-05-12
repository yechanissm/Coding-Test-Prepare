package org.example.level1;

public class 푸드파이트대회 {

    static String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++) {
            int j = food[i]/2;
            for(int k=0; k<j; k++) {
                answer += String.valueOf(i);
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        String reverse = sb.reverse().toString();
        answer += "0"+ reverse;

        return answer;
    }

    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        System.out.println(solution(food));
    }
}
