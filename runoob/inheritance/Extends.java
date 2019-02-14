package runoob.inheritance;

public class Extends {
}

class Animal {
    private String name;
    private int id;

    public Animal(String myName, String myId) {
        // 初始化属性值
    }

    public void eat() {
        // 吃东西方法的具体实现
    }

    public void sleep() {
        // 睡觉方法的具体实现
    }
}

class Penguin extends Animal {
    public Penguin(String myName, String myId) {
        super(myName, myId);
    }
}