package main.java.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by demon on 2016/11/15.
 */
public class BinarySearchTreePath {
    public class Solution {
        public List<Node> findShortestPath(Node head, int x, int  y) {
            List<Node> result = new ArrayList<Node>();
            head = findLowestCommonAncestor(head, x, y);
            List<Node> left = findPath(head, x);
            List<Node> right = findPath(head, y);
            if (x < y) {
                left.remove(left.size() - 1);
                result.addAll(left);
                result.addAll(right);
            } else {
                right.remove(result.size() - 1);
                result.addAll(right);
                result.addAll(left);
            }
            return result;
        }
        private List<Node> findPath(Node head, int x) {
            List<Node> result = new ArrayList<Node>();
            if (head.value == x) {
                result.add(head);
                return result;
            }
            if (head.value > x) {
                List<Node> left = findPath(head.left, x);
                result.addAll(left);
                result.add(head);
            }
            if (head.value < x) {
                result.add(head);
                List<Node> right = findPath(head.right, x);
                result.addAll(right);
            }
            return result;
        }
        private Node findLowestCommonAncestor(Node node, int value1, int value2) {
            if (node == null)
                return null;
            if (node.value > value1 && node.value > value2)
                return findLowestCommonAncestor(node.left, value1, value2);
            else if (node.value < value1 && node.value < value2)
                return findLowestCommonAncestor(node.right, value1, value2);
            else
                return node;
        }
        private class Node {
            public Node left;
            public Node right;
            public int value;
        }
    }
}
