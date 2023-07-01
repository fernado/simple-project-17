package pr.iceworld.fernando.designpattern.behavioral.ex03;


public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(ApproveRequest approveRequest) {
        if (approveRequest.getPrice() <= 5000) {
            System.out.println(" 请求编号 id= " + approveRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            this.next.processRequest(approveRequest);
        }
    }
}
