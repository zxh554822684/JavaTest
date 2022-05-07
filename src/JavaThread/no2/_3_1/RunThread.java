package JavaThread.no2._3_1;

public class RunThread extends Thread{
    volatile private boolean isRunning = true;
    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run方法！");
        while (isRunning == true) {

        }
        System.out.println("线程停止！");
    }
}
