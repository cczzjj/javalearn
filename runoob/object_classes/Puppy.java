package runoob.object_classes;

public class Puppy {
    int puppyAge;
    public Puppy() {}
    public Puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是：" + name);
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    public int getPuppyAge() {
        return puppyAge;
    }

    public static void main(String[] args) {
        /* 创建对象 */
        Puppy myPuppy = new Puppy("tommy");
        /* 通过方法来设定age */
        myPuppy.setPuppyAge(2);
        /* 调用另一个方法获取age */
        myPuppy.getPuppyAge();
        /* 你也可以像下面这样访问成员变量 */
        System.out.println("变量值：" + myPuppy.puppyAge);
    }
}
