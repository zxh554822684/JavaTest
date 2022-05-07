package wy;

import java.util.ArrayList;
import java.util.List;

public class test01 {

    //
    // public int[][] search_log (long[][] logs, long[] tss) {
    //     // write code here
    //
    //
    // }
    public static void main(String[] args) {
        List<Integer> list = null;
        fun(list);
        System.out.println(list.get(0));
    }
    public static void fun(List<Integer> list) {
        list = new ArrayList<>();
        list.add(1);
    }
}
