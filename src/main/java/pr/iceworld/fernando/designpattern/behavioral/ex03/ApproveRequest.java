package pr.iceworld.fernando.designpattern.behavioral.ex03;

public class ApproveRequest {
	private int type = 0; //请求类型
	private float price = 0.0f; //请求金额
	private int id = 0;
	//构造器
	public ApproveRequest(int type, float price, int id) {
		this.type = type;
		this.price = price;
		this.id = id;
	}

	public int getType() { return type; }
	public float getPrice() { return price; }
	public int getId() { return id; }
}
