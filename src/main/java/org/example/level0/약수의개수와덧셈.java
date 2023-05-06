package org.example.level0;

public class 약수의개수와덧셈 {
    static int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for(int i=left; i<=right; i++) {
            for(int j=1; j<=left; j++) {
                if(left%i==0) {
                    count++;
                }
            }
            if(count%2==0) {
                answer += left;
            }
            else{
                answer -= left;
            }
            count =0;
        }
        return answer;
    }
    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        System.out.println(solution(left, right));
    }
}
