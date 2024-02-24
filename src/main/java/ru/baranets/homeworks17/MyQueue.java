package ru.baranets.homeworks17;

import java.util.Arrays;

public class MyQueue {
    MyLinkedList list = new MyLinkedList();
    public void offer(int value) {
        list.addLast(value);
    }

    public void poll() {
        list.remove(0);
        return;
    }

}
