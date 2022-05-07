package JavaThread.no3._1_19;

public class ThreadConsumer extends Thread{
    private Consumer consumer;

    public ThreadConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumer.getValue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
