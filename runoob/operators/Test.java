package runoob.operators;

public class Test {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

        System.out.println("=================分割线===============");

        a = 10;
        b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        System.out.println("=================分割线===============");

        a = 60; /* 60 = 0011 1100 */
        b = 13; /* 13 = 0000 1101 */
        c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);

        System.out.println("=================分割线===============");

        boolean f = true;
        boolean e = false;
        System.out.println("a && b = " + (f && e));
        System.out.println("a || b = " + (f || e));
        System.out.println("!(a && b) = " + !(f && e));

        System.out.println("=================分割线===============");

        int g = 5;//定义一个变量；
        boolean h = (g<4)&&(g++<10);
        System.out.println("使用短路逻辑运算符的结果为"+h);
        System.out.println("a的结果为"+g);
    }
}
