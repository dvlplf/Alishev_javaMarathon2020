package day6;

public class Car {
    private int yearRelease;
    private String color;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        return year - this.yearRelease;
    }
}
