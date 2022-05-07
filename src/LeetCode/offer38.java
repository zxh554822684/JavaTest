package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class offer38 {
    List<String> resList = new ArrayList<>();
    char[] c;
    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return resList.toArray(new String[resList.size()]);
    }
    public void dfs(int x) {
        if(x == c.length - 1) {
            resList.add(String.valueOf(c));
            return;
        }
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = x; i <= c.length - 1; i++) {
            // 去重
            if(hashSet.contains(c[i])) continue;
            hashSet.add(c[i]);

            char temp = c[x];
            c[x] = c[i];
            c[i] = temp;

            dfs(x + 1);

            temp = c[x];
            c[x] = c[i];
            c[i] = temp;
        }
    }
}
