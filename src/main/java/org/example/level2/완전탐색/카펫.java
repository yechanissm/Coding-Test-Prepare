package org.example.level2.완전탐색;

public class 카펫 {

    static int[] solution(int brown, int yellow) {
        int[] result = new int[2];

        int sum = brown + yellow;

        for(int i=3; i<sum; i++) {
            int j = sum / i;

            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.max(i, j);
                int center = (col-2) * (row-2);

                if(center==yellow) {
                    return result;
                }
            }
        }

        return result;
    }
}
