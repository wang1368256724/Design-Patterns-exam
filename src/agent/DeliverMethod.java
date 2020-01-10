package agent;
//就餐方式---dining Or selfpick
public class DeliverMethod implements methods {
	boolean flag;
	public DeliverMethod(boolean flag){
		this.flag = flag;
	}
	
	@Override
	public String selectMethod(){
		if(flag){//如果flag为true，则选择店内用餐
			methods express = new dining(flag);
			return express.sendCoke("店内用餐");
		}else{//否则，自提带走
			methods tradition = new selfpick(flag);
			return tradition.sendCoke("自提带走");
		}
	}

	@Override
	public String sendCoke(String method) {
		return null;
	}

	

}
