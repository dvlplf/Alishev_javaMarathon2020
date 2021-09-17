package day4;

import java.util.Arrays;
import java.util.Scanner;

//а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива


public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        int up8 = 0, eq1 = 0, ood = 0, ddd = 0, sum = 0;

        for (int i = 0; i < num; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] > 8) up8++;
            if (array[i] == 1) eq1++;
            if (array[i] % 2 == 0) {
                ood++;
            } else {
                ddd++;
            }
            sum += array[i];
        }
        System.out.println("Введено число " + num + ". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + up8);
        System.out.println("Количество чисел равных 1: " + eq1);
        System.out.println("Количество четных чисел: " + ood);
        System.out.println("Количество нечетных чисел: " + ddd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
