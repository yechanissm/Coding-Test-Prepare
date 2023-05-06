package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 같은숫자는싫어 {

    static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int tmp = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != tmp) {
                list.add(arr[i]);
                tmp = arr[i];
            }
        }


    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};

        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
    }
}
