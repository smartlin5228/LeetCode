package main.java.linkedlist;

import java.time.temporal.ValueRange;

/**
 * Given two integers represented as linked lists, write a function that returns a linked list representing
 the sum of the two integers. The digits stored in the linked list are in reverse order
 */
public class LinkedlistIntegerAddition {
    public class Solution{
        public Node addLinkedListNumbers(Node first, Node second) {
            int carry = 0;
            Node result = null;
            Node iter = null;
            while (first != null || second != null) {
                int firstValue = first == null ? 0 : first.value;
                int secondValue = second == null ? 0 : second.value;
                int sum = (firstValue + secondValue + carry) % 10;
                carry = (firstValue + secondValue + carry) / 10;
                Node node = new Node();
                node.value = sum;
                node.next = null;
                if (result == null) {
                    iter = node;
                    return node;
                } else {
                    iter.next = node;
                    iter = node;
                }
                first = first == null ? null : first.next;
                second = second == null ? null : second.next;
            }
            if (carry != 0) {
                Node node = new Node();
                node.value = carry;
                node.next = null;
                iter.next = node;
                iter = node;
            }
            return result;
        }
    }
    private class Node {
        public Node next;
        public int value;
    }
}
