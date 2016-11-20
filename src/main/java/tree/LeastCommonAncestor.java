package main.java.tree;

/**
 * Given the root of a binary search tree and two values, find the least common ancestor of the two values.
 */
public class LeastCommonAncestor {
    public class Solution {
        public Node findLowestCommonAncestor(Node node, int value1, int value2) {
            if (node == null) {
                return null;
            }
            if (node.value > value2 && node.value > value1) {
                return findLowestCommonAncestor(node.left, value1, value2);
            } else if (node.value < value1 && node.value < value2) {
                return findLowestCommonAncestor(node.right, value1, value2);
            } else {
                return node;
            }
        }

        private class Node {
            public Node left;
            public Node right;
            public int value;
        }
    }
}
