package org.example.level0;

public class 저주의숫자3 {

    public static int solution(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            count ++;
            while(count%3 == 0 || String.valueOf(count).contains("3")){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));

    }
}
