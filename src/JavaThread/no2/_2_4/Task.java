package JavaThread.no2._2_4;

public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("nosy = " + Thread.currentThread().getName() + "   i = " + i);
        }
        System.out.println(" ");
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                System.out.println("sy = " + Thread.currentThread().getName() + "   i = " + i);
            }
        }
    }
}
