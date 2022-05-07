package JavaThread.No1.no1_11.test;

public class IsAlive extends Thread{
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}
