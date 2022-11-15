package stack_queue;

import java.util.ArrayList;

class MyStack {

    ArrayList<Integer> arr;
    public MyStack() {
        this.arr = new ArrayList<>();
    }

    public void push(int x) {
        arr.add(x);
    }

    public int pop() {
        return arr.remove(arr.size()-1);
    }

    public int top() {
        return arr.get(arr.size()-1);
    }

    public boolean empty() {
        return arr.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

public class leetcode225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        ArrayList<Integer> arrTest = new ArrayList<>(50);
        System.out.println(myStack.pop());

    }
}
