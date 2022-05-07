package JavaThread.no3._3_3;

public class Run {
    public static void main(String[] args) {
        MyThreadA myThreadA = new MyThreadA();
        MyThreadB myThreadB = new MyThreadB();
        myThreadA.start();
        myThreadB.start();
        for (int i = 0; i < 10; i++) {
            Tools.t1.set("main" + (i + 1));
            System.out.println("        main get" + Tools.t1.get());
            int sleepValue = (int) (Math.random() * 1000);
            try {
                Thread.sleep(sleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
