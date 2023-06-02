package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class memo {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();
        int person = stages.length;
        double rate = 0;
        int stage = 1;
        int up = 0;
        for(int i=1; i<=N; i++) {
            for(int j=0; j<stages.length; j++) {
                if(stages[j]==stage) {
                    up++;
                }
            }
            rate = (double) up/person;
            person -=up;
            up = 0;
            stage++;
            map.put(i, rate);
        }
        List<Integer> key = new ArrayList<>(map.keySet());

        Collections.sort(key, (v1,v2) -> (map.get(v2).compareTo(map.get(v1))));

        for(int k :key) {
            System.out.println(k);
        }

        return answer;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {3,3,3,3};

        System.out.println(solution(N,stages));

    }
}
