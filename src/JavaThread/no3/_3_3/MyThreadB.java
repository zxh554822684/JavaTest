package JavaThread.no3._3_3;

public class MyThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Tools.t1.set("B" + (i + 1));
            System.out.println("    B get" + Tools.t1.get());
            int sleepValue = (int) (Math.random() * 1000);
            try {
                Thread.sleep(sleepValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}