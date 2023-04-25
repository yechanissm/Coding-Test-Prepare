package org.example.level0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class 특이한정렬 {

    public static Integer[] solution(int[] numlist, int n) {
        Integer[] answer = new Integer[numlist.length];

        for(int i = 0; i < numlist.length; i++)
        {
            answer[i] = numlist[i];
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        System.out.println();

        Arrays.sort(answer, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b)
            {
                System.out.println(Arrays.toString(answer));
                System.out.println(a);
                System.out.println(b);
                System.out.println();
                System.out.println();
                if(Math.abs(n-a) == Math.abs(n-b))
                {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(b-a);
                    System.out.println();
                    System.out.println();
                    return b - a;
                }
                System.out.println(Math.abs(n-a) - Math.abs(n - b));
                return Math.abs(n-a) - Math.abs(n - b);
            }
        });
        return answer;
    }
    public static void main(String[] args) {
        int[] numlist = {1,2,3,4,5,6};
        int n =4;

        System.out.println(Arrays.toString(solution(numlist,n)));

    }
}
