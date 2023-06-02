package org.example.level1;

public class 소수만들기 {

    static int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if(isTrue(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    static boolean isTrue(int sum) {
        for(int i=2; i<=Math.sqrt(sum); i++) {
            if(sum%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums =  {1,2,3,4};
        int[] nums2 = {1,2,7,6,4};

        System.out.println(solution(nums));
        System.out.println(solution(nums2));
    }
}
