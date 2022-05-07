package JavaThread.no3._1_5;

public class MyThread2 extends Thread{
    private Object lock;
    public MyThread2(Object o) {
        this.lock = o;
    }

    @Override
    public void run() {
            synchronized (lock) {
                System.out.println("开始     notify time = " + System.currentTimeMillis());
                lock.notify();
                System.out.println("结束     notify time = " + System.currentTimeMillis());
            }

    }
}
