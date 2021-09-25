package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/day14/.txt");
        printSumDigits(file);

    }

    public static  void printSumDigits(File file) {
        int res = 0;
        try {
            Scanner sc = new Scanner(file);
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersStr = line.split(" ");
            if (numbersStr.length != 10) {
                throw new IOException();
            }
            for (String str: numbersStr) {
                res += Integer.parseInt(str);
            }
            System.out.println(res);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }


    }
}
