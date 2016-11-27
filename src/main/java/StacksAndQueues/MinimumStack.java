package main.java.StacksAndQueues;


import java.util.Stack;

public class MinimumStack <E extends Comparable<E>> extends Stack<E>{
    private Stack<E> minStack;
    public MinimumStack() {
        super();
        minStack = new Stack<E>();
    }
    @Override
    public E push(E element) {
        if (element.compareTo(minStack.peek()) <= 0) {
            minStack.push(element);
        }
        return super.push(element);
    }
    @Override
    public E pop() {
        E element = super.pop();
        if (element.compareTo(minStack.peek()) == 0) {
            minStack.pop();
        }
        return element;
    }
    public E findMin() {
        return minStack.peek();
    }
}
