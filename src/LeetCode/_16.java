package LeetCode;

public class _16 {
    public double myPow(double x, int n) {
        if(x == 0 && n < 0) {
            return 0;
        }
        int absN;

        if(n < 0) absN = -n;
        else absN = n;

        double res = power(x, absN);
        if(n < 0) return 1.0 / res;
        return res;
    }
    public double power(double x, int absN) {
        double res = 1.0;

        while(absN != 0) {
            if((absN & 1) == 1) res = res * x;
            x *= x;
            absN = absN >>> 1;

        }
        return res;
    }
}
