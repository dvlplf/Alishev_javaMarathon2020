package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Dave", "Literature");
        Student student1 = new Student("Bob");
        for (int i = 0; i < 10; i++) {
            teacher1.evaluate(student1);
            System.out.println();
        }

    }
}
