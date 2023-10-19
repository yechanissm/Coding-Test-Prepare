package org.example.difficult2;

public class 두개의숫자열 {

    public static void main(String[] args) {

        int[] a = {1, 5, 3};
        int[] b = {3, 6, -7, 5, 4};
        int max = 0;

        if(a.length > b.length) {
            for(int i=0; i<=a.length-b.length; i++) {
                int sum = 0;
                for(int j =0; j<b.length; j++) {
                    sum += a[i+j] * b[j];
                }
                max = Math.max(sum, max);
            }
            System.out.println(max);
        }
        else {
            for(int i=0; i<=b.length-a.length; i++) {
                int sum = 0;
                for(int j =0; j<a.length; j++) {
                    sum += b[i+j] * a[j];
                }
                max = Math.max(sum, max);
            }
            System.out.println(max);
        }

    }
}
