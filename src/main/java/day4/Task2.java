package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int countNumZero = 0;
        int sumNumEndZero = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int min = array[0];
        int max = array[0];
        for (int num: array) {
            if (num < min) min = num;
            if (num > max) max = num;
            if (num % 10 == 0) {
                countNumZero++;
                sumNumEndZero += num;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Count = " + countNumZero);
        System.out.println("Sum = " + sumNumEndZero);
    }
}
