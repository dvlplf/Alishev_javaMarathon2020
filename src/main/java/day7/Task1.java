package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeng", 1990, 100, 2000);
        Airplane airplane2 = new Airplane("Suhoy", 1990, 180, 2000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}