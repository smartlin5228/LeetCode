package main.java.tree;

/**
 * Explain how binary search trees work.
 * Searching a binary search tree can be performed in O(log n) time (well balanced)
 */
public class HowBinarySearchTreeWorks {
    public class BinarySearchTree {
        public void insert(Node head, Node newNode) {
            if (newNode.value < head.value) {
                if (head.left == null) {
                    head.left = newNode;
                } else {
                    insert(head.left, newNode);
                }
            } else {
                if (head.right == null) {
                    head.right = newNode;
                } else {
                    insert(head.right, newNode);
                }
            }
        }
        private class Node {
            public Node left;
            public Node right;
            public int value;
        }
    }
}
