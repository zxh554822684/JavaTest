package LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class offer41 {
    PriorityQueue<Integer> littleHeap = new PriorityQueue<>();
    PriorityQueue<Integer> bigHeap = new PriorityQueue<>(new Comparator<Integer>(){
        public int compare(Integer num1, Integer num2) {
            return num2 - num1;
        }
    });

    public static int numSum = 0;


    public void addNum(int num) {
        numSum++;
        bigHeap.add(num);

        littleHeap.add(bigHeap.poll());
        bigHeap.add(littleHeap.poll());

        // 如果numSum是偶数的话
        if((numSum & 1) == 0) littleHeap.add(bigHeap.poll());
    }

    public double findMedian() {
        double res = 0;
        // 如果numSum是偶数的话
        if((numSum & 1) == 0 && !bigHeap.isEmpty()) {
            int left = bigHeap.peek();
            int rigth = littleHeap.peek();
            res = (double) (left + rigth) / 2;
        }
        // 如果numSum是奇数的话
        if((numSum & 1) == 1 && !bigHeap.isEmpty()) res = bigHeap.peek();
        return res;
    }
}
