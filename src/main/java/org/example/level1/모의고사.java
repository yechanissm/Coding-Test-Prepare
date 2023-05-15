package org.example.level1;

public class 모의고사 {

    static int[] solution(int[] answers){
        int[] answer = new int[3];
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};

        for(int i=0; i<answers.length; i++) {
            if(answers[i]==person1[i%5]) {
                answer[0] ++;
            }
            if(answers[i]==person2[i%8]) {
                answer[1] ++;
            }
            if(answers[i]==person3[i%10]) {
                answer[2] ++;
            }
        }

        int max_price = Math.max(answer[0], Math.max(answer[1], answer[2]));


        return answer;
    }
    public static void main(String[] args) {
        int[] answers1 =  {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        System.out.println(solution(answers1));
        System.out.println(solution(answers2));
    }
}
