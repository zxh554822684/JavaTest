package JavaVM.No3;

public class ReferenceCounting {
    public Object instance = null;
    private static final int _1M = 1024 * 1024;
    private byte[] bigSize = new  byte[2*_1M];

   /**
    * @Author zxh
    * @Description: 
    * @Param: 
    * @Return:  
    * @Create: 2020/9/26 10:32
    */
    private static void                                                                                                                                                                                                                                      testGC(){
        ReferenceCounting referenceCounting1 = new ReferenceCounting();
        ReferenceCounting referenceCounting2 = new ReferenceCounting();
        referenceCounting1.instance = referenceCounting2;
        referenceCounting2.instance = referenceCounting1;

        referenceCounting1 = null;
        referenceCounting2 = null;

        System.gc();
    }

}
