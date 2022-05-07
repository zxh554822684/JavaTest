package JavaThread.No1.no1_13;


import JavaThread.No1.no1_13.thread.MyThread;

public class TestYield {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
