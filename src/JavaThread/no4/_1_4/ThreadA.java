package JavaThread.no4._1_4;

import JavaThread.no4._1_1.Run;

public class ThreadA extends Thread{
    private MyService myService = new MyService();

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
