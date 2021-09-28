package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {-402, -50, -249, -15, -665, -311};

        System.out.println(recursionSum(numbers, 0));
       }

    public static int recursionSum (int[] numbers, int id) {
        if (id < numbers.length)
           return numbers[id] + recursionSum(numbers, id + 1);

        return 0;
    }
}
