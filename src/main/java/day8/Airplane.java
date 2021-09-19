package day8;

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

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        return
                sb.append("Изготовитель: ")
                .append(this.producer)
                .append(", год выпуска: ")
                .append(this.yearRelease)
                .append(", длина: ")
                .append(this.length)
                .append(", вес: ")
                .append(this.weight)
                .append(", количество топлива в баке ")
                .append(this.fuel)
                .toString();
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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length == airplane2.length) {
            System.out.println("Самолеты равны по длинне");
        } else if (airplane1.length > airplane2.length) {
            System.out.println(airplane1.producer + " длиннее, чем " + airplane2.getProducer());
        } else {
            System.out.println(airplane2.producer + " длиннее, чем " + airplane1.getProducer());
        }
    }
}
