package JavaThread.No1.no1_11;

import JavaThread.No1.no1_11.test.MyThread;

public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(10);
        myThread.interrupt();
//        System.out.println("是否停止1？=" + myThread.interrupted());
//        System.out.println("是否停止2？=" + myThread.interrupted());

        System.out.println("是否停止1？=" + myThread.isInterrupted());
        System.out.println("是否停止2？=" + myThread.isInterrupted());

        System.out.println("end!");
    }
}
