package agent;
//通过快递公司代理方式发货
public class dining implements methods {
	boolean flag;
	String m = null;
	
	public dining(boolean flag ){
		this.flag = flag;
	}
	
	@Override
	public String sendCoke(String method) {
		if(flag == true){
			m = method;
		}
		return "您的订单已生成，已经通过"+m+"方式为您发货，请注意查收！";
	}

	@Override
	public String selectMethod() {
		return null;
	}

}
