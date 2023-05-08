package org.example.level0;

import java.util.Arrays;

public class 비밀지도1차 {

    static String[] solution(int n, int[] arr1, int[] arr2) {

        String[] binary_arr1 = binaryChange(arr1,n);
        String[] binary_arr2 = binaryChange(arr2,n);

        String[] change_arr1 = replaceChange(binary_arr1);
        String[] change_arr2 = replaceChange(binary_arr2);

        String[] answer = addArray(change_arr1, change_arr2);

        return answer;
    }

    private static String[] addArray(String[] change_arr1, String[] change_arr2) {
        String[] answer = new String[change_arr1.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = "";
            String[] sen1 = change_arr1[i].split("");
            String[] sen2 = change_arr2[i].split("");
            for(int j=0; j<sen1.length; j++) {
                if(sen1[j].equals("#") || sen2[j].equals("#")) {
                    answer[i] += "#";
                }
                else{
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }

    static String[] replaceChange(String[] binary_arr1) {
        String[] result = new String[binary_arr1.length];
        for(int i=0; i<binary_arr1.length; i++) {
            result[i] = binary_arr1[i].replace("1", "#");
            result[i] = result[i].replace("0", " ");
        }
        return result;
    }

    static String[] binaryChange(int[] arr, int n) {
        String[] result = new String[n];
        for(int i=0; i<result.length; i++) {
            result[i] = String.format("%"+n+"s", Integer.parseInt(Integer.toBinaryString(arr[i])));

        }
        return result;
    }

    public static void main(String[] args) {
        int n= 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        System.out.println(Arrays.toString(solution(n,arr1,arr2)));
    }
}
