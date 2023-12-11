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

        int[] array = {4,5,4,6,29,75,64,0,-9,-5,-3,0,16};
        boolean exchange = true;
        while (exchange) {
            exchange = false;
            for (int i = 1; i < array.length; i++) {
                int curr = array[i - 1];
                if (curr > array[i]) {
                    array[i - 1] = array[i];
                    array[i] = curr;
                    exchange = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
