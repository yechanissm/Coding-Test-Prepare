package org.example.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억점수 {

    static int[] solution(String[] name, int[] yearning, String[][] photo){
        int[] result = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
    }

    public static void main(String[] args) {
        String[] name = {"may", "kevin", "kain", "radi"};
        int[] yearning = {5,10,1,3};
        String[][] photo = {{"may","kevin","kain","radi"},
                            {"may","kevin","fsd","dsfs"},
                            {"kon", "kain","may","coni"}};

        System.out.println(Arrays.toString(solution(name,yearning,photo)));
    }
}
