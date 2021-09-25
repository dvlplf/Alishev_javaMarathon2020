package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day16/.txt");
        printResult(file);
    }

    public static  void printResult(File file) {
        int sum = 0;

        try {
            Scanner sc = new Scanner(file);
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersStr = line.split(" ");
            for (String str: numbersStr) {
                sum += Integer.parseInt(str);
            }

            double result = (double) sum / numbersStr.length;
            System.out.print(result + " --> " +String.format("%.3f", result));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
