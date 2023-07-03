package org.example.level2.백트래킹;

import java.util.HashSet;

public class 소수찾기 {

    static HashSet<Integer> set = new HashSet<>();
    static char[] arr;
    static boolean[] visited;

    static int solution(String numbers) {
        int answer = 0;
        arr = new char[numbers.length()];
        visited = new boolean[numbers.length()];

        for(int i=0; i<numbers.length(); i++) {
            arr[i] = numbers.charAt(i);
        }
        recursion("", 0);
        answer = set.size();
        return answer;
    }

    private static void recursion(String str, int index) {
        int num;
        if(str!="") {
            num = Integer.parseInt(str);
            if(isPrime(num)) {
                set.add(num);
            }
        }
        if(index==arr.length) {
            return;
        }
        for(int i=0; i<arr.length; i++) {
            if(visited[i]) {
                continue;
            }
            visited[i] = true;
            recursion(str+arr[i], index+1);
            visited[i] = false;
        }
    }

    private static boolean isPrime(int num) {
        if(num==0 || num==1) {
            return false;
        }
        for(int i=2; i*i <=num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String numbers2 = "011";

        System.out.println(solution(numbers2));
    }
}
