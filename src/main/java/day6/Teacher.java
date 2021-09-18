package day6;

public class Teacher {
    private final String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate (Student student) {
        int gradeNum = (int) (Math.random() * 4 + 2);
        String grade;
        switch (gradeNum) {
            case 5:
                grade = "Отлично";
                break;
            case 4:
                grade = "Хорошо";
                break;
            case 3:
                grade = "Удовлетворительно";
                break;
            case 2:
                grade = "Недовлетворительно";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + gradeNum);
        }
        System.out.println("Преподаватель "+ this.getName() +" оценил студента с именем "+ student.getName() +"\n" +
                "по предмету " + this.getSubject() + " на оценку " + grade + ".");
    }
}
