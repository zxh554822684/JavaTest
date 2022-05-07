package tx;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] times = new int[n];
        int[] beifen = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
            beifen[i] = times[i];
        }

        for (int i = 0; i < k; i++) {
            int cur = 0;
            int minTime = times[0];
            for (int j = 1; j < n; j++) {
                if (minTime > times[j]) {
                    minTime = times[j];
                    cur = j;
                }
            }
            System.out.println(cur + 1);
            times[cur] = times[cur] + beifen[cur];
        }
    }
}
