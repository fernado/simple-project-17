package pr.iceworld.fernando.designpattern.behavioral.ex03;

public class Client {
	public static void main(String[] args) {
		//创建一个请求
		ApproveRequest approveRequest = new ApproveRequest(1, 10111, 1);
		//创建相关的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");
		
		//需要将各个审批级别的下一个设置好 
		departmentApprover.setNext(collegeApprover);
		collegeApprover.setNext(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setNext(schoolMasterApprover);

		departmentApprover.processRequest(approveRequest);
	}
}
