package org.example.level0;

public class 비밀지도1차 {

    static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[] binary_arr1 = binaryChange(arr1,n);
        for(String s : binary_arr1) {
            System.out.println(s);
        }
        return answer;
    }

    static String[] binaryChange(int[] arr, int n) {
        String[] result = new String[5];
        for(int i=0; i<result.length; i++) {
            result[i] = String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr[i])));
        }
        return result;
    }

    public static void main(String[] args) {
        int n= 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        System.out.println(solution(n,arr1,arr2));
    }
}
