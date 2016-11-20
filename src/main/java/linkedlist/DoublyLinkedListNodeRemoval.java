package main.java.linkedlist;

/**
 * Created by demon on 2016/11/15.
 */
public class DoublyLinkedListNodeRemoval {
    public class Solution {
        public void removeTargetNode(Node head, int target) {
            Node current = head;
            while (current != null) {
                if (current.value == target) {
                    if (current.next != null) {
                        current.next.previous = current.previous;
                    }
                    if (current.previous != null) {
                        current.previous.next = current.next;
                    }
                    current = current.next;
                }
            }
        }
    }

    private class Node {
        public Node next;
        public Node previous;
        public int value;
    }
}
