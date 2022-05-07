package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class offer62 {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        int index = m - 1;
        for(int i = 0;  i < n; i++) {
            list.add(i);
        }
        while (list.size() != 1) {
            list.remove(index);
            index = (index + m - 1) % list.size();
        }
        return list.get(0);
    }
}
