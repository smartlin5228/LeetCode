package main.java.linkedlist;

/**
 * Created by demon on 2016/11/15.
 */
public class FindingCyclesInSinglyLinkedList {
    public class Solution {
        public boolean hasCycle(Node head) {
            if (head == null) {
                return false;
            }
            Node turtle, rabbit;
            turtle = rabbit = head;
            while (true) {
                turtle = turtle.next;
                if (rabbit.next != null)
                    rabbit = rabbit.next.next;
                else
                    return false;
                if (turtle == null || rabbit == null)
                    return false;
                if (turtle == rabbit)
                    return true;
            }
        }
    }
    public class Node {
        public Node next;
        public int value;
    }

}

