package JavaThread.no3._1_19;

public class ThreadProduct extends Thread{
    private Product product;

    public ThreadProduct(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            try {
                product.setValue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
