package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            nums.add(i);
        }
        for (int i = 300; i < 500; i++) {
            nums.add(i);
        }
        for (Integer num: nums){
            System.out.println(num);
        }
    }
}
