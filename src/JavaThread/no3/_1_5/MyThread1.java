package JavaThread.no3._1_5;

public class MyThread1 extends Thread{
    private Object lock;
    public MyThread1(Object o) {
        this.lock = o;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始     wait time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束      wait time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
