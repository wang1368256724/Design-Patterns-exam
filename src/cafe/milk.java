package coke;
//百事可乐--具体产品类
public class milk implements drink {

	@Override
	public String produce() {
		String str = "牛奶正在准备中";
		return str;
	}
}
