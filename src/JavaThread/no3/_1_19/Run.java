package JavaThread.no3._1_19;

public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Product product = new Product(lock);
        Consumer consumer = new Consumer(lock);

        ThreadProduct threadProduct = new ThreadProduct(product);
        ThreadConsumer threadConsumer = new ThreadConsumer(consumer);


        threadProduct.start();
        threadConsumer.start();
    }
}
