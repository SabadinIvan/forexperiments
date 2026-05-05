package behaved.chainofresponsibility;

public abstract class LeaveApprover {
    protected LeaveApprover nextApprover;

    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveLeave(int days);

    protected void passToNext(int days) {
        if (nextApprover != null) {
            System.out.println("Передаем запрос на " + days + " дней следующему обработчику");
            nextApprover.approveLeave(days);
        } else {
            System.out.println("Запрос на " + days + " дней не может быть одобрен");
        }
    }
}
