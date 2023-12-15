package ru.baranets.homeworks17;

public class MyStack {
    MyLinkedList list = new MyLinkedList();

    public void push(int data) {
        list.addFirst(data);
    }

    public void pop() {
        list.remove(1);
    }

}
