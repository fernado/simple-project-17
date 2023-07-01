package pr.iceworld.fernando.designpattern.behavioral.ex03;


public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }


    @Override
    public void processRequest(ApproveRequest approveRequest) {
        if (approveRequest.getPrice() > 5000 && approveRequest.getPrice() <= 10000) {
            System.out.println(" 请求编号 id= " + approveRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            this.next.processRequest(approveRequest);
        }
    }
}
