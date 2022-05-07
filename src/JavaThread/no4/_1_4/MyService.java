package JavaThread.no4._1_4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await() {
        lock.lock();
        System.out.println("await的时间为：" + System.currentTimeMillis());
        try {
            condition.await();
            System.out.println("之后");
        } catch (InterruptedException e) {
            lock.unlock();
        }
    }
    public void signal() {
        lock.lock();
        System.out.println("signal的时间为：" + System.currentTimeMillis());
        condition.signal();
        lock.unlock();
    }
}
