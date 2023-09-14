package me.veryyoung.oj.util;

public class LinkedListNode<T> {

    public T data;

    public LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public static <T> T[] toArray(LinkedListNode head) {
        if (head == null) {
            return null;
        }

        int size = getSize(head);
        T[] array = (T[]) new Object[size];

        LinkedListNode<T> current = head;
        int index = 0;

        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }

        return array;
    }

    public static int getSize(LinkedListNode<?> head) {
        int size = 0;
        LinkedListNode<?> current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    public static <T> LinkedListNode<T> toListNode(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        LinkedListNode<T> head = new LinkedListNode<>(array[0]);
        LinkedListNode<T> current = head;

        for (int i = 1; i < array.length; i++) {
            LinkedListNode<T> newNode = new LinkedListNode<>(array[i]);
            current.next = newNode;
            current = newNode;
        }
        return head;
    }
}