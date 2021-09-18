package day6;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeng", 1987, 100, 2500);
        airplane1.setWeight(2800);
        airplane1.setLength(102);
        airplane1.fillUp(200);
        airplane1.fillUp(30);
        airplane1.fillUp(100);
        airplane1.info();
    }
}
