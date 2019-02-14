package runoob.modifier_types;

public final class Test {
    final int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue(){
//        value = 12; //将输出一个错误
    }

    public final void changeName(){
        // 方法体
    }
}

abstract class Caravan{
    private double price;
    private String model;
    private String year;
    public abstract void goFast(); // 抽象方法
    public abstract void changeColor();
}
