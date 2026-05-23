package generating.singleton.exam;

public class ExamDemo {

    public static void main(String[] args) {
        Teacher teacher = Teacher.getInstance();

        teacher.tookTheExam("Bob");
        teacher.tookTheExam("John");
        teacher.tookTheExam("Mary");
        teacher.tookTheExam("Liam");

        System.out.println("The exam is over. " + teacher.getCount() + " students passed the exam.");
    }
}
