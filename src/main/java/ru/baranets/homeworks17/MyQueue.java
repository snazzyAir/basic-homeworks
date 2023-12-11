package ru.baranets.homeworks17;

import java.util.Arrays;

public class MyQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(4);
        myQueue.poll(4);
    }

    MyLinkedList list = new MyLinkedList();

    public void offer(int value) {
        list.addLast(value);
    }

    public void poll(int value) {
        list.remove(value);
    }

}
