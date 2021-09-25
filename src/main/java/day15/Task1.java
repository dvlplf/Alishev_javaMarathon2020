package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        //src/main/resources/missing_shoes.txt
        //src/main/resources/shoes.csv
        //Ботинки HS РАН-Р 400 чер. ЗП;38;1
        getMissingShoes();
    }

    public static void getMissingShoes() throws FileNotFoundException {
        List<String> missingShoes = new ArrayList<>();
        File source = new File("src/main/resources/shoes.csv");

        Scanner sc = new Scanner(source);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArr = line.split(";");

            if (Integer.parseInt(lineArr[2]) == 0) {
                missingShoes.add(line);

            }
        }
        sc.close();

        File input = new File("src/main/resources/missing_shoes.txt");
        PrintWriter pw = new PrintWriter(input);
        for (String line: missingShoes) {
            pw.println(line);
            System.out.println(line);
        }
        pw.close();
    }
}

