package bishiTest;

import java.text.DecimalFormat;
import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.000");
        double res = cal_sqrt(n);
        System.out.println(df.format(res));
    }
    public static double cal_sqrt(int a) {
        double x1 = 1, x2;
        x2 = x1 / 2.0 + a / (2 * x1);
        while (Math.abs(x2 - x1) > 1e-4) {
            x1 = x2;
            x2 = x1 / 2.0 + a / (2 * x1);
        }
        return x2;
    }
}
