package bishiTest;

public class MyObject {
    private volatile static MyObject myObject;
    private MyObject(){

    }
    public static MyObject getInstance() {
        if(myObject != null) {

        }else {
            synchronized (MyObject.class) {
                if (myObject == null) {
                    myObject = new MyObject();
                }
            }
        }
        return myObject;
    }

    public static void main(String[] args) {
        MyObject myObject1 = MyObject.getInstance();
        MyObject myObject2 = MyObject.getInstance();
        System.out.println(myObject1 == myObject2);
    }
}

