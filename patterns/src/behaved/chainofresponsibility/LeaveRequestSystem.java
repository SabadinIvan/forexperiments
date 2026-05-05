package behaved.chainofresponsibility;

public class LeaveRequestSystem {
    public static void main(String[] args) {
        LeaveApprover junior = new JuniorManager();
        LeaveApprover senior = new SeniorManager();
        LeaveApprover director = new Director();

        junior.setNextApprover(senior);
        senior.setNextApprover(director);

        junior.approveLeave(2);
        junior.approveLeave(5);
        junior.approveLeave(10);
        junior.approveLeave(30);
    }
}
