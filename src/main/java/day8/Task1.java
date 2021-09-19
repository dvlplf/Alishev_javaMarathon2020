package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        countStr1(0, 40000);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
        startTime = System.currentTimeMillis();
        countStr2(0, 40000);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
    }

    public static String countStr1(int numStart, int numEnd) {
        String str = "";
        for (int i = numStart; i < numEnd; i++) {
            str += i + " ";
        }
        return str;
    }

    public static String countStr2(int numStart, int numEnd) {
        StringBuilder sb = new StringBuilder("");
        for (int i = numStart; i < numEnd; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }
}
