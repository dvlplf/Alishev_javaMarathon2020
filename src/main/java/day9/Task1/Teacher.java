package day9.Task1;

public class Teacher extends Human{
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubject(String subject) {
        this.subjectName = subject;
    }

    public Teacher(String name, String subject) {
        super(name);
        this.subjectName = subject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
