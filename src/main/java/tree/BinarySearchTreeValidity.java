package main.java.tree;

import org.junit.Test;

/**
 * Created by demon on 2016/11/15.
 */
public class BinarySearchTreeValidity {
    public class Solution {
        public boolean isValidBST(Node root) {
            return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        private boolean isValidBST(Node current, int min, int max) {
            if (current.right != null) {
                if (current.right.value > max || !isValidBST(current.right, current.value, max))
                    return false;
            }
            if (current.left != null) {
                if (current.left.value < min || !isValidBST(current.left, min, current.value))
                    return false;
            }
            return true;
        }

        public class Node {
            public Node left;
            public Node right;
            public int value;
        }
    }
}

