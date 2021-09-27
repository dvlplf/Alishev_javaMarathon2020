package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();
        carBrands.add("Honda");
        carBrands.add("Toyota");
        carBrands.add("Ford");
        carBrands.add("BMW");
        carBrands.add("Kia");

        for (int i = 0; i < 5; i++) {
            System.out.println(carBrands.get(i));
        }
        carBrands.remove(0);
        System.out.println(Arrays.toString(carBrands.toArray()));
    }
}
