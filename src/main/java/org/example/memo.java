package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class memo {
    public static void main(String[] args) {
        String substring = LocalDate.of(2016, 5, 24).getDayOfWeek().toString().substring(0, 3);
        System.out.println(substring);

        String[][] photo = {{"may","kevin","kain","radi"},
                {"may","kevin","fsd","dsfs"},
                {"kon", "kain","may","coni"}};
        Map<Integer, Integer> map = new HashMap<>();
        map.put(3,1);
        map.put(3,2);
        System.out.println(map);



    }
}
