package LeetCode;

public class offer44 {
    public int findNthDigit(int n) {
        long cur = 10;
        if(n < cur) return n;
        int i = 1;
        long weishu = 0;
        long target = 0;
        while(cur < n) {
            i++;
            weishu = 9*i*(int)Math.pow(10,i - 1);
            cur += weishu;
        }

        cur = cur - weishu;
        long base = (int)Math.pow(10 , i - 1);
        int yushu = (int) (n - cur) % i;
        int shang = (int) (n - cur) / i;

        target = base + shang;
        return String.valueOf(target).charAt(yushu) - '0';
    }
}
