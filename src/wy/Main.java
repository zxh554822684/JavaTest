package wy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        for (int num : arr) {
            if(queue.size() < k) {
                queue.add(num);
            }else {
                if (num < queue.peek()) {
                    queue.poll();
                    queue.add(num);
                }
            }
        }
        queue.forEach(System.out::println);
        Integer[] integers = queue.toArray(new Integer[0]);
        System.out.println("*****************************");
        for (int num : integers) {
            System.out.println(num);
        }
    }
}
