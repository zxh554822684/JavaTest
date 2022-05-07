package bishiTest;

public class MyObject1 {
    private static MyObject1 myObject1;
    static {
        myObject1 = new MyObject1();
    }
    public static MyObject1 getInstance() {
        return myObject1;
    }

    public static void main(String[] args) {
        MyObject1 myObject1 = MyObject1.getInstance();
        MyObject1 instance = MyObject1.getInstance();
        System.out.println(myObject1 == instance);


        for (int i = 0; i < 10; i++) {
            System.out.println(MyObject1.getInstance().hashCode());
        }
    }
}