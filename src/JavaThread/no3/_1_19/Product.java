package JavaThread.no3._1_19;

public class Product {
    private String lock;

    public Product(String lock) {
        this.lock = lock;
    }

    public void setValue() throws InterruptedException {
        synchronized (lock) {
            if (!ValueObject.value.equals("")) {
                lock.wait();
            }
            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            System.out.println("set的值是:" + value);
            ValueObject.value = value;
            lock.notify();
        }
    }
}
