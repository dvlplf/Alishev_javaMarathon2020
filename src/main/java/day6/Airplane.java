package day6;

public class Airplane {
    private String producer;
    private int yearRelease;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int yearRelease, int length, int weight) {
        this.producer = producer;
        this.yearRelease = yearRelease;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.producer+ ", год выпуска: " + this.yearRelease + ", длина: "+ this.length + ", вес: "+ this.weight +", количество топлива в баке: " + this.fuel);
    }

    public void fillUp(int addFuel) {
        this.fuel += addFuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return this.fuel;
    }
}
