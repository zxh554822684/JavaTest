package bishiTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println("dassdsads");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
            list.add(a+b);
        }
        for (int num : list) {
            System.out.println(num);
        }
    }
}
