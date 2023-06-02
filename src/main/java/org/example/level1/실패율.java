package org.example.level1;

import java.util.*;

public class 실패율 {

    static int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        int person = stages.length; //게임하는 총 인원
        double rate = 0; //성공률
        int stage = 1; //스테이지
        int up =0; //분자로써, 성공률을 구할 때 사용 - 그 스테이지의 머무른 인원

        //5단계까지 반복할 때 map의 키값으로 스테이지를, 벨류값으로 성공률을 담을 것
        for(int i=1; i<=N; i++) {
            for(int j=0; j<stages.length; j++) {
                if(stages[j]==stage) {
                    up++;
                }
            }
            if(person==0 && up ==0) {
                map.put(i, 0.0);
                continue;
            }
            rate = (double) up /person; //성공률
            person -= up; //남은 인원 변경
            up = 0; //스테이지에 머무른 인원 초기화
            stage++;//스테이지 한단계 증가
            map.put(i, rate);
        }

        List<Integer> key = new ArrayList<>(map.keySet());
        //성공률 내림차순 정률 == 실패율 높은 차순 정렬
        Collections.sort(key, (v1,v2) -> map.get(v2).compareTo(map.get(v1)));
        return key.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] stages2 = {4,1,2,3};

        System.out.println(Arrays.toString(solution(N, stages)));
        System.out.println(Arrays.toString(solution(4, stages2)));

    }
}
