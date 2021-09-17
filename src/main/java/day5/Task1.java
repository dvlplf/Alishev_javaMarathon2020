package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearRelease(1990);
        car1.setColor("red");
        car1.setModel("Opel");
        System.out.println(car1.getModel());
        System.out.println(car1.getYearRelease());
        System.out.println(car1.getColor());
    }
}

class Car {
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
}
