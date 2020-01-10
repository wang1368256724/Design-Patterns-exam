package coke;
//可口可乐--具体产品类
public class cookie implements desert {

    @Override
    public String produce() {
        String str = "曲奇正在准备中";
        return str;
    }
}
