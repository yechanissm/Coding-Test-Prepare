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
            arr[i] = numbers.charAt(0);
        }
        recursion("", 0);


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
    }

    private static boolean isPrime(int num) {
    }

    public static void main(String[] args) {
        String numbers1 = "17";
        String numbers2 = "011";

        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
    }
}
