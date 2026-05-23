package generating.singleton.exam;

public class Teacher {
    private static Teacher instance;
    private static int count = 0;

    private Teacher(){}

    public static synchronized Teacher getInstance() {
        if (instance == null) {
            instance = new Teacher();
        }
        return instance;
    }

    public synchronized void inc() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public synchronized void tookTheExam(String studentName) {
        System.out.println("Examiner took the exam from " + studentName);
        count++;
    }
}
