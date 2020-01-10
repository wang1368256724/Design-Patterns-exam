package coke;
//可口可乐--具体产品类
public class cake implements desert {

    @Override
    public String produce() {
        String str = "蛋糕正在准备中";
        return str;
    }
}
