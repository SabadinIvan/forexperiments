package behaved.chainofresponsibility;

public class SeniorManager extends LeaveApprover {
    @Override
    public void approveLeave(int days) {
        if (days <= 7) {
            System.out.println("Старший менеджер одобрил отпуск на " + days + " дней.");
        } else {
            passToNext(days);
        }
    }
}
