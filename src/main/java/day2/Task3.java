package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = a + 1;
        int b = scanner.nextInt();
        while (i < b) {
            if (i % 5 == 0) {
                if (i % 10 == 0) {
                    i++;
                    continue;
                }
                System.out.print(i);
                System.out.print(" ");
            }
            i++;
        }
    }
}
