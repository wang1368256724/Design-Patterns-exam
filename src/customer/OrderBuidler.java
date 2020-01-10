package customer;
//订单具体建造者---建造者模式
public class OrderBuidler {
	private String num;//单号


	
	public OrderBuidler(String num){
		this.num = num;


	}



	//生成订单方法
	public Order create(){
		return new Order(this);
	}

	public String getNum() {
		return num;
	}

	}

	

