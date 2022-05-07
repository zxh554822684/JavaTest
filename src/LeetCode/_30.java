package LeetCode;

import java.util.Stack;

public class _30 {
    Stack<Integer> A, B;
    /** initialize your data structure here. */
    public _30() {
        A = new Stack();
        B = new Stack();
    }

    public void push(int x) {
        A.push(x);
        if(B.isEmpty() || B.peek() >= x) {
            B.push(x);
        }
    }

    public void pop() {
        int e = A.pop();
        if(e == B.peek()) B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
