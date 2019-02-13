package runoob.date_time;

import java.util.Date;

public class SleepDemo {
    public static void main(String args[]) {
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3);   // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }

        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
