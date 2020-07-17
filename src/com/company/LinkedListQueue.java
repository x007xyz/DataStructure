package com.company;

public class LinkedListQueue<E> implements Queue<E> {

    private int size;
    private Node head, tail;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }
        Node node = head;
        head = head.next;
        node.next = null;
        if (head == null) {
            tail = null;
        }
        size --;
        return node.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot getFront from an empty queue.");
        }
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        public E e;
        public Node next;

        public Node (E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node (E e) {
            this(e, null);
        }

        public Node () {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
