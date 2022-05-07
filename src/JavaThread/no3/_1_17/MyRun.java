package JavaThread.no3._1_17;


public class MyRun {
   private String lock = new String(" ");
   private boolean isFirstRunB = false;


   private Runnable runnableA = new Runnable() {
       public void run() {
           synchronized (lock) {
               try {
                   if (!isFirstRunB) {
                       System.out.println("wait begin");
                       lock.wait();
                       System.out.println("wait end");
                   }
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    };


   private Runnable runnableB = new Runnable() {
       @Override
       public void run() {
           synchronized (lock) {
               System.out.println("notify begin");
               lock.notify();
               System.out.println("notify end");
               isFirstRunB = true;
           }
       }
   };



    public static void main(String[] args) throws InterruptedException {
        MyRun myRun = new MyRun();

        Thread threadB = new Thread((myRun.runnableB));
        threadB.start();

        Thread.sleep(100);
        Thread threadA = new Thread(myRun.runnableA);
        threadA.start();

    }

}
