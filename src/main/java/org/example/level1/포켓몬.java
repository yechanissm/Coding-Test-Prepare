package org.example.level1;

import java.util.HashMap;
import java.util.Map;

public class 포켓몬 {
    static int solution(int[] nums) {
        int answer = 0;
        int len = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i],i);
        }
        answer = map.size();
        return answer>len ? len : answer;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};
        System.out.println(solution(nums));
        System.out.println(solution(nums2));
        System.out.println(solution(nums3));

    }
}
