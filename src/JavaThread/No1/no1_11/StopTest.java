package JavaThread.No1.no1_11;

import JavaThread.No1.no1_11.test.ThreadStop;

public class StopTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadStop threadStop = new ThreadStop();
        threadStop.start();
        Thread.sleep(800);
        threadStop.stop();
    }
}
