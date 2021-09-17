package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike harley = new Motorbike(1990, "Harley", "Black");
        System.out.println(harley.getYear());
        System.out.println(harley.getModel());
        System.out.println(harley.getColor());

    }
}
class Motorbike {
    private int year;
    private String model;
    private String color;


    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
