package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "SB100");
        Teacher teacher1 = new Teacher("Dave", "History");

        System.out.println(student1.getName());
        System.out.println(student1.getGroupName());
        student1.printInfo();
        System.out.println();
        System.out.println(teacher1.getName());
        System.out.println(teacher1.getSubjectName());
        teacher1.printInfo();
    }
}
