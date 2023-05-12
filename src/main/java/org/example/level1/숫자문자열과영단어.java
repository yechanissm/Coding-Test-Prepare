package org.example.level1;

public class 숫자문자열과영단어 {

    static int solution(String s) {
        int answer = 0;
        String[][] num = {{"zero","0"}, {"one", "1"}, {"two","2"}, {"three","3"}
                ,{"four","4"}, {"five","5"}, {"six","6"}, {"seven","7"}
                , {"eight","8"}, {"nine","9"}};

        for(int i=0; i<num.length; i++) {
            if(s.contains(num[i][0])){
                s = s.replaceAll(num[i][0], num[i][1]);
            }
        }
        answer =Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        String s = "one4seveneight";

        System.out.println(solution(s));
    }
}
