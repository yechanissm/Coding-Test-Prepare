package org.example.difficult2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 조교의성적매기기 {

    public static void main(String[] args) {

        String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

        Scanner sc = new Scanner(System.in);
        int totalPerson = sc.nextInt();
        int guessPerson = sc.nextInt();
        Double[] personScore = new Double[totalPerson];
        for(int i=0; i<personScore.length; i++) {
            double middle = sc.nextInt()*0.35;
            double last = sc.nextInt()*0.45;
            double subject = sc.nextInt()*0.2;
            personScore[i] = middle + last+ subject;
        }
        Double findPerson = personScore[guessPerson - 1];
        int index =0;
        Arrays.sort(personScore, Collections.reverseOrder());
        for(int i=0; i<personScore.length; i++) {
            if(findPerson == personScore[i]) {
                index = i;
            }
        }
        System.out.println("#" + score[index]);


    }
}
