package LeetCode;

public class offer45 {
    public void strSort(String[] strs, int l, int r) {
        if(l >= r) return;
        int i = l;
        int j = r;
        // 作为基准值
        String temp = strs[l];
        while(i < j) {
            while((strs[j] + temp).compareTo(temp + strs[j]) > 0 && i < j) j--;
            strs[i] = strs[j];
            while((strs[i] + temp).compareTo(temp + strs[i]) <= 0 && i < j) i++;
            strs[j] = strs[i];
        }
        strs[i] = temp;

        strSort(strs, l, i - 1);
        strSort(strs, i + 1, r);
    }
}
