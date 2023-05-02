package org.example.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은수제거하기 {

    static int[] solution(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0]; //최소값 구하기

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }
        //최소값을 제외한 값들을 리스트에 넣기
        int[] answer;
        if (list.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        //리스트가 비어있으면 -1 아니면 값을 넣어준다.
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] arr2 = {10};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr2)));

    }
}
