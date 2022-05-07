package JavaThread.no3._1_5;

public class TestWaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread1 myThread1 = new MyThread1(lock);
        myThread1.start();
        Thread.sleep(4000);
        MyThread2 myThread2 = new MyThread2(lock);
        myThread2.start();

    }
}
