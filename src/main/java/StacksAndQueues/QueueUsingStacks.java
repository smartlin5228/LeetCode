package main.java.StacksAndQueues;

import java.util.Stack;

public class QueueUsingStacks {
    public class Solution {
        public class Queue<E> {
            private Stack<E> incoming = new Stack<E>();
            private Stack<E> outgoing = new Stack<E>();

            public void queue(E item) {
                incoming.push(item);
            }
            public E dequeue() {
                if (outgoing.isEmpty()) {
                    while (!incoming.isEmpty()) {
                        outgoing.push(incoming.pop());
                    }
                }
                return outgoing.pop();
            }
        }
    }
}
