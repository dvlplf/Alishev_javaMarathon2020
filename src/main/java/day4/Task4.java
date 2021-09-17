package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int max = 0;
        int idMax = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        for (int i = 1; i < array.length - 1; i++) {

            int sum = array[i - 1] + array[i] + array[i + 1];
            if (sum > max) {
                max = sum;
                idMax = i - 1;
            }
        }
        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("sumMax = " + max);
        System.out.println("idMax = " + idMax);
    }
}
