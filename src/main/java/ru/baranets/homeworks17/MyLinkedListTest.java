package ru.baranets.homeworks17;

import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(0,12);
        list.add(1,45);
        list.add(2,67);
        list.addFirst(999);
        list.addLast(111);
        list.getFirst();
        list.getLast();
        list.get(3);
        System.out.println(list.toString());
        list.remove(3);
        list.getSize();

        System.out.println(list.toString());



    }
}
