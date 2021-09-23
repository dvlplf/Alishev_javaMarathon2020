package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/day14/.txt");
        printSumDigits(file);

    }

    public static  void printSumDigits(File file) throws FileNotFoundException {
        int res = 0;
        Scanner sc = new Scanner(file);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersStr = line.split(" ");
        for (String str: numbersStr) {
            res += Integer.parseInt(str);
        }
        System.out.println(res);
    }
}
