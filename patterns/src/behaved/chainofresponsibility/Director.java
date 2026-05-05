package behaved.chainofresponsibility;

public class Director extends LeaveApprover {
    @Override
    public void approveLeave(int days) {
        System.out.println("Директор одобрил отпуск на " + days + " дней.");
    }
}
