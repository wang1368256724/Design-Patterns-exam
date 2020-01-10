package company;
//单例模式--drink
public class drink {
	private drink(){}
	private static class SingletonInstance{//静态内部类
		private static final drink INSTANCE = new drink();
	}
	
	public static drink getInstance(){
		return SingletonInstance.INSTANCE;
	}
	public String call(){
		return "drink";
	}
}
