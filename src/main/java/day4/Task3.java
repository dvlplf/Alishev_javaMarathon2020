package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];
        int maxId = 0;
        int maxSumm = 0;

        for (int i = 0; i < m; i++){
            int sum = 0;
            for (int k = 0; k < n; k++){
                array[i][k] = (int) (Math.random() * 50);
                sum += array[i][k];
            }
            System.out.println(Arrays.toString(array[i]) + " = " + sum);
            if (sum > maxSumm) {
                maxSumm = sum;
                maxId = i;
            }
        }
        System.out.println("Array: ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }

        System.out.println("maxSumm = " + maxSumm);
        System.out.println("maxId = " + maxId);
    }
}
