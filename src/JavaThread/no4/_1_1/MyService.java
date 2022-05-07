package JavaThread.no4._1_1;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadName = " + Thread.currentThread().getName() +"  i=" + (i + 1));
        }
        lock.unlock();
    }
}
