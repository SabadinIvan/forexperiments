package behaved.chainofresponsibility;

public class JuniorManager extends LeaveApprover {
    @Override
    public void approveLeave(int days) {
        if (days <= 3) {
            System.out.println("Младший менеджер одобрил отпуск на " + days + " дней.");
        } else {
            passToNext(days);
        }
    }
}
