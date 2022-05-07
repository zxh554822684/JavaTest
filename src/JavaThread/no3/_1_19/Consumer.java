package JavaThread.no3._1_19;

public class Consumer {
    private String lock;

    public Consumer(String lock) {
        this.lock = lock;
    }

    public void getValue() throws InterruptedException {
        synchronized (lock) {
            if (ValueObject.value.equals("")) {
                lock.wait();
            }
            System.out.println("get的值是:" + ValueObject.value);
            ValueObject.value = "";
            lock.notify();
        }
    }
}
