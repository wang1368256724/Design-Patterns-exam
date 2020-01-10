package coke;
//可口可乐--具体产品类
public class juice implements drink {

	@Override
	public String produce() {
		String str = "果汁正在准备中";
		return str;
	}
}
