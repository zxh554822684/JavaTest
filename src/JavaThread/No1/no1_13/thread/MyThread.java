package JavaThread.No1.no1_13.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count  = 0;
        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count = count + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时:" + (endTime - beginTime) + "毫秒！");
    }
}
