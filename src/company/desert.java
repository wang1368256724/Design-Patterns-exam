package company;
//单例模式---desert
public class desert {
	private desert(){}
	private static class SingletonInstance{//静态内部类
		private static final desert INSTANCE = new desert();
	}
	
	public static desert getInstance(){
		return SingletonInstance.INSTANCE;
	}
	public String call(){
		return "desert";
	}
}
