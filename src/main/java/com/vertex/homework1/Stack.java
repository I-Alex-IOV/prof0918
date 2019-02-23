package com.vertex.homework1;

public interface Stack<T> {
    void put(T t);

    T get();
}

class LinkedStack<T> implements Stack<T> {
    private StackNode<T> head;

    public void put(T t) {
        head = new StackNode<>(t, head);
    }

    public T get() {
        if (head == null) return null;
        T res = head.val;
        head = head.next;
        return res;
    }

    private class StackNode<T> {
        T val;
        StackNode<T> next;

        StackNode(T t, StackNode<T> next) {
            this.val = t;
            this.next = next;
        }
    }

}