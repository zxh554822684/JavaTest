package qiuzhao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Singleton {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
        char[] chars = str.toCharArray();
        String s = new String(chars);
        System.out.println(s);
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("dqawd");
        list.add("das");
        String[] strings = list.toArray(new String[0]);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Integer[] integers = list1.toArray(new Integer[0]);
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
        Set<String> set = new HashSet<>();
        set.add("123");
        set.add("123");
        set.add("456");
        set.forEach(System.out::println);

    }
}