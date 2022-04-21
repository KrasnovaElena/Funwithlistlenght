public class Main {
    /*Implement the method length, which accepts a linked list (head), and returns the length of the list.

    For example: Given the list: 1 -> 2 -> 3 -> 4, length should return 4.*/
    class Node {
        public Object data;
        public Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }
    class Solution {
        static int length(Node head) {
            if(head == null) return 0;
            return length(head.next) + 1;
        }
    }
}
