package day18;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {

       System.out.println(count7(717771237));// 5
    }

    public static int count7(int number) {
        if (number % 10 == 7) {
            return 1 + count7(number / 10);
        }
        if (number > 0) {
            return count7(number / 10);
        }
       return 0;
    }
}
