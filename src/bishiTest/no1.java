package bishiTest;

import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int[] X = new int[n];
        int[] Y = new int[n];
        for (int i = 0;  i < n; i++) {
            X[i] = scanner.nextInt();
        }
        for (int i = 0;  i < n; i++) {
            Y[i] = scanner.nextInt();
        }
        System.out.println(cal(n,X,Y));



    }
    public static int cal(int n, int[] X, int[] Y) {
        int d = 0;
        for (int i = 0; i < n; i++) {
            d += Math.abs(X[i] - Y[i]);
        }
        return d;
    }
}
