package JavaThread.No1.no1_15;


import JavaThread.No1.no1_15.thread.MyThread;

public class TestDaemon {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        Thread.sleep(5000);
        System.out.println("mian结束！");
    }
}
