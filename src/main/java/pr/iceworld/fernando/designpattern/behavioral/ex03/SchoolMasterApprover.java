package pr.iceworld.fernando.designpattern.behavioral.ex03;


public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(ApproveRequest approveRequest) {
        if (approveRequest.getPrice() > 30000) {
            System.out.println(" 请求编号 id= " + approveRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            this.next.processRequest(approveRequest);
        }
    }
}
