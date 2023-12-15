package ru.baranets.homeworks17;

import java.util.Arrays;

public class MyLinkedList {
    private Item first;
    private Item last;
    private int size = 0;

    public void addFirst(int value) {
        final Item f = first;
        Item item = new Item(value, f, null);
        first = item;
        if (f == null) {
            last = item;
        } else {
            f.previous = item;
            size++;
        }
    }

    public void addLast(int value) {
        final Item l = last;
        final Item item = new Item(value, null, l);
        last = item;
        if (l == null)
            first = item;
        else
            l.next = item;
        size++;
    }

    public Item getFirst() {
        if (first == null) {
            return null;
        }
        return first;
    }

    public Item getLast() {
        if (last == null) {
            return null;
        }
        return last;
    }

    public void add(int position, int value) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (position == size) {
            addLast(value);
        } else if (position == 0) {
            addFirst(value);
        } else {
            Item curr = get(position - 1);
            Item item = new Item(value, curr.next, curr.next.previous);
            curr.next.previous = item;
            curr.next = item;
            size++;
        }
    }

    public Item get(int position) {
        Item curr = first;
        for (int i = 0; i < position; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder().append('[');
        Item current = first;
        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }
        return builder.append(']').toString();
    }

    public void remove(int position) {
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (position == 0) {
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Item prev = get(position - 1);
            Item current = prev.next;
            Item next = current.next;
            prev.next = next;
            last = (next == null) ? prev : last;
        }
        size--;
    }

    public int getSize() {
        int sizeG = 0;
        for (int i = 0; i < size; i++) {
            sizeG++;
        }
        return sizeG;
    }

    private static class Item {
        int value;
        Item next;
        Item previous;

        public Item(int value, Item next, Item previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public static void arraySorting(int[] array) {
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

