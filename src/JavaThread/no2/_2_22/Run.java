package JavaThread.no2._2_22;

public class Run {
    public static void main(String[] args) {
        OuterCalss.InnerCalss1 innerCalss1 = new OuterCalss.InnerCalss1();
        OuterCalss.InnerClass2 innerClass2 = new OuterCalss.InnerClass2();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerCalss1.method1(innerClass2);
            }
        }, "t1");
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerCalss1.method2();
            }
        }, "t2");

        t2.start();
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method1();
            }
        }, "t3");

        t3.start();
    }
}
