package org.example.level1;

import java.util.ArrayList;
import java.util.List;

public class 두개뽑아서더하기 {

    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(!list.contains(numbers[i]+numbers[j])){
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }
        int[] answer = list.stream().sorted().mapToInt(i -> i).toArray();
        return answer;

    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
    }
}
