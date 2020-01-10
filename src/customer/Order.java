package customer;
//订单类
public class Order {
	private String num;//订单号


	
	public Order(OrderBuidler builder){
		this.num = builder.getNum();


	}
	

	public String getNum() {
		return num;
	}




}


	

