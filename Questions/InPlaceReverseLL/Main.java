// package Questions.InPlaceReverseLL;

import java.util.*;

public class Main {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

        }

        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void reversePI() {
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            Node ex = head;
            head = tail;
            tail = ex;
        }

        public Node getNodeAtIndex(int idx) {
            Node n = head;
            for (int i = 0; i < idx; i++) {
                n = n.next;
            }
            return n;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);

        // Pointer Iteratevely:-
        // ll.display();
        // System.out.println("------------------------------------------------------------------------------");
        // ll.reversePI();
        // ll.display();

        // Data Iteratevly:-
        ll.display();
        System.out.println("------------------------------------------------------------------------------");
        int size = ll.size();
        int i = 0;
        int j = size - 1;

        while (i < j) {
            Node first = ll.getNodeAtIndex(i);
            Node last = ll.getNodeAtIndex(j);

            int temp = first.data;
            first.data = last.data;
            last.data = temp;
            i++;
            j--;
        }

        ll.display();

    }

}
