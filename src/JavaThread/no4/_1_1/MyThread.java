package JavaThread.no4._1_1;

public class MyThread extends Thread{
    private MyService myService = new MyService();

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
