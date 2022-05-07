package LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class offer59_2 {
    Deque<Integer> queue1;
    Deque<Integer> queue2;
    public offer59_2() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public int max_value() {
        if(queue2.isEmpty()) return -1;
        return queue2.peekFirst();
    }
    // 队尾插入
    public void push_back(int value) {
        queue1.add(value);
        while(!queue2.isEmpty() && queue2.peekLast() < value) {
            queue2.removeLast();
        }
        queue2.addLast(value);
    }
    // 队头删除
    public int pop_front() {
        if(queue1.isEmpty()) return -1;
        int a = queue1.peekFirst();
        int b = queue2.peekFirst();

        if(a == queue2.peekFirst()) {
            queue2.removeFirst();
        }
        // queue1.peekFirst()返回的是一个Integer包装类，在小常量池内（0 - 127）的话用==判断没什么问题，因为是同一个指针，
        //但是如果超过小常量池的范围，两个引用肯定是不相等的
        // if (queue1.peekFirst() == queue2.peekFirst()) {
        //     queue2.removeFirst();
        // }
        return queue1.remove();
    }
}
