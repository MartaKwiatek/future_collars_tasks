package org.Marta;

import java.util.NoSuchElementException;

public class MyQueue implements OwnQueue{

    static class QNode {
        private final Integer data;
        private QNode next;
        private QNode prev;

        public QNode(Integer data) {
            this.data = data;
        }

        public Integer getData() {
            return data;
        }
    }

    private QNode head, tail = null;

    private void changeHead() {
        head.prev = null;
    }

    private void changeTail() {
        tail.next = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean add(Integer e) {
        QNode newNode = new QNode(e);

        if (isEmpty()) {
            head = tail = newNode;
            changeHead();
            changeTail();
            return true;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            changeTail();
            return true;
        }
    }

    @Override
    public Integer remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Can not remove element from empty queue");
        }
        Integer toRemove = head.getData();
        if (size() > 1) {
            head = head.next;
            changeHead();
        } else {
            head = tail = null;
        }
        return toRemove;
    }

    @Override
    public Integer element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Can not retrieve element from empty queue");
        }
        return head.getData();
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            QNode current = head;
            int size = 0;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }
    }

    public void printQueue() {
        QNode current = head;
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("The contents of your queue: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();
    }
}
