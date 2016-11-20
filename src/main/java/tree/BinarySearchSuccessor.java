package main.java.tree;

/**
 * Given the root of a binary search tree and a value, find the "successor" of that value,
 */
public class BinarySearchSuccessor {
    public class Solution {
        private Node getLeftMost(Node head) {
            Node current = head;
            while(current.left != null) {
                current = current.left;
            }
            return current;
        }
        private Node getRightMost(Node head) {
            Node current = head;
            while (current.right != null) {
                current = current.right;
            }
            return current;
        }
        public int getSuccessor(Node head, int target) {
            Node current = head;
            int successor = 0;
            while (current != null) {
                if (current.value < target && current.right != null) {
                    current = current.right;
                } else if (current.value > target) {
                    if (current.left != null && getRightMost(current.left).value > target)
                        current = current.left;
                    else {
                        successor = current.value;
                        current = null;
                    }
                } else {
                    if (current.right != null) {
                        successor = getLeftMost(current.right).value;
                    }
                    current = null;
                }
            }
            return successor;
        }
    }
    private static class Node {
        private Node left;
        private Node right;
        private int value;
    }
}
