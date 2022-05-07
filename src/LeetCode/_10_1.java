package LeetCode;

public class _10_1 {
    final static int constant = 1000000007;
    public static void fib(int n) {
        int a1 = 0;
        int a2 = 1;
        int temp;
        for(int i = 0; i < n - 1; i++) {
            temp = a2;
            a2 = (a1 + a2)%constant;
            a1 =temp;
            System.out.println(a2);
        }
    }

    public static void main(String[] args) {
       fib(48);
    }
}
