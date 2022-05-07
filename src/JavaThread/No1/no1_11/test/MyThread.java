package JavaThread.No1.no1_11.test;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            if (this.interrupted()){
                System.out.println("over!");
                break;
            }
            System.out.print("i=" + (i + 1) + "\t");
            if (i%10 == 0) System.out.println();
        }
    }
}
