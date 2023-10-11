package org.example.difficult1;

import java.util.Scanner;

public class 연월일달력 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        for(int test_case = 1; test_case<=T; test_case++) {
            String answer = sc.next();
            if(answer.length()!=8) {
                System.out.println("#"+ test_case + " -1");
                continue;
            }
            String year = answer.substring(0,4);
            String month = answer.substring(4,6);
            int month_int = Integer.parseInt(month);
            if(!(month_int>=1 && month_int<=12)){
                System.out.println("#"+ test_case + " -1");
                continue;
            }
            String day = answer.substring(6);
            int day_int = Integer.parseInt(day);
            if(!(day_int>=1 && day_int<=days[month_int-1])) {
                System.out.println("#"+ test_case + " -1");
                continue;
            }
            answer = year + "/" + month + "/" + day;
            System.out.println("#" + test_case + " " + answer);
        }
    }
}
