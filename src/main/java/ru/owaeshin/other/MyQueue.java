package ru.owaeshin.other;

import java.util.Stack;

public class MyQueue {

    private final Stack<Integer> values = new Stack<>();
    public final Stack<Integer> reversValues = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {
        for (int i = 0; i < reversValues.size(); i++) {
            values.push(reversValues.pop());
        }
        values.push(x);
        for (int i = 0; i < values.size(); i++) {
            reversValues.push(values.pop());
        }
    }

    public int pop() {
        return reversValues.pop();
    }

    public int peek() {
        return reversValues.peek();
    }

    public boolean empty() {
        return reversValues.isEmpty();
    }
}
