package JavaThread.No1.no1_11;

import JavaThread.No1.no1_11.test.IsAlive;

public class TestIsAlive {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main = " + Thread.currentThread().isAlive());
        IsAlive isAlive = new IsAlive();
        System.out.println("begin = "+ isAlive.isAlive());
        isAlive.start();
        Thread.sleep(2000);
        System.out.println("end = " + isAlive.isAlive());
    }
}
