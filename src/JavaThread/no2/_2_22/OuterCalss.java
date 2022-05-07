package JavaThread.no2._2_22;

public class OuterCalss {
    static class InnerCalss1 {
        public void method1(InnerClass2 innerClass2) {
            String name = Thread.currentThread().getName();
            synchronized (innerClass2) {
                System.out.println(name + "进入InnerClass1的method1方法");
                for (int i = 0; i < 100; i++) {
                    System.out.println(name + "  i = " + i);
                }
                System.out.println(name + "离开InnerClass1的method1方法");
            }
        }
        public synchronized void method2() {
                String name = Thread.currentThread().getName();
                System.out.println(name + "进入InnerClass2的method2方法");
                for (int i = 0; i < 100; i++) {
                    System.out.println(name + "  j = " + i);
                }
                System.out.println(name + "离开InnerClass2的method2方法");
        }
    }
    static class InnerClass2 {
            synchronized public void method1() {
                String name = Thread.currentThread().getName();
                System.out.println(name + "进入InnerClass1的method2方法");
                for (int i = 0; i < 10; i++) {
                    System.out.println(name + "  k = " + i);
                }
                System.out.println(name + "离开InnerClass1的method2方法");
            }

    }
}
