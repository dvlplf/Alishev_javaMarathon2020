package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/java/day14/people.txt");

            System.out.println(parseFileToStringList(file));



    }

    public static List<String> parseFileToStringList(File file) {
        List<String> result = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] numbersStr = line.split(" ");
                if (Integer.parseInt(numbersStr[1]) < 0) {
                    throw new IOException();
                }
                result.add(line);
            }
            sc.close();
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
