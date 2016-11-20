package main.java.linkedlist;

/**
 * insertion time
 of O(1) and a lookup time of O(n).
 */
public class HowLinkedListWorks {
    public class Node {
        public String data;
        public Node next;

        public Node(String data) {
            this(data, null);
        }
        public Node(String data, Node node) {
            this.data = data;
            this.next = node;
        }
    }
}
