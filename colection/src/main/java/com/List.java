package com;

class List {
    private Node head;
    private Node tail;

    void add(int data) {
        Node a = new Node();
        a.value = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }


    public String toString() {
        Node t = head;
        StringBuffer sb = new StringBuffer();
        while (t != null) {
            sb.append(t.value + " ");
            t = t.next;
        }
        return sb.toString();
    }

    void remove(int elem) {
        if (head == null)
            return;

        if (head == tail && head.value == elem) {
            head = null;
            tail = null;
            return;
        }

        if (head.value == elem) {
            head = head.next;
            return;
        }

        Node t = head;
        while (t.next != null) {
            if (t.next.value == elem) {
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
}