package day6;

public class Motorbike {
        private int yearRelease;
        private String model;
        private String color;


        public Motorbike(int year, String model, String color) {
            this.yearRelease = year;
            this.model = model;
            this.color = color;
        }

        public int getYearRelease() {
            return yearRelease;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return year - this.yearRelease;
    }
}
