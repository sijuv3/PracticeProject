package practice;

public class Queue {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.data;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null)
            head = node;
    }

    public int remove() {
        int data = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        return  data;
    }
}
