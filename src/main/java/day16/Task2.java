package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        PrintWriter pw1 = new PrintWriter("src/main/java/day16/1.txt", StandardCharsets.UTF_8);
        PrintWriter pw2 = new PrintWriter("src/main/java/day16/2.txt", StandardCharsets.UTF_8);
        double average = 0;
        for (int i = 1; i <= 1000; i++) {
            int num = (int) (Math.random() * 100);
            if (i % 20 == 0) {
                average += num;
                pw2.println(average/20);
                average = 0;
            }
            pw1.println(num);
        }
        pw1.close();
        pw2.close();

        File file = new File("src/main/java/day16/2.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        double sum = 0;
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            double num = Double.parseDouble(str);
            sum += num;
        }
        sc.close();
        System.out.println((int) sum);

    }
}
